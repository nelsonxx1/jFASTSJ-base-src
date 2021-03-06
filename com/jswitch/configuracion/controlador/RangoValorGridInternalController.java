package com.jswitch.configuracion.controlador;

import com.jswitch.base.controlador.General;
import com.jswitch.base.controlador.logger.LoggerUtil;
import com.jswitch.base.controlador.util.DefaultGridInternalController;
import com.jswitch.base.modelo.HibernateUtil;
import com.jswitch.base.modelo.entidades.auditoria.Auditable;
import com.jswitch.base.modelo.entidades.auditoria.AuditoriaBasica;
import com.jswitch.configuracion.modelo.maestra.ConfiguracionProntoPago;
import com.jswitch.configuracion.modelo.transaccional.SumaAsegurada;
import com.jswitch.configuracion.modelo.maestra.TimbreMunicipal;
import com.jswitch.configuracion.modelo.transaccional.RangoValor;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.type.LongType;
import org.hibernate.type.Type;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOListResponse;
import org.openswing.swing.message.receive.java.VOResponse;
import org.openswing.swing.message.receive.java.ValueObject;
import org.openswing.swing.util.server.HibernateUtils;

/**
 *
 * @author bc
 */
public class RangoValorGridInternalController extends DefaultGridInternalController {

    Class clase;

    public RangoValorGridInternalController(String classNameModelFullPath, String getMethodName, GridControl miGrid, Class clase, DefaultGridInternalController... listSubGrids) {
        super(classNameModelFullPath, getMethodName, miGrid, listSubGrids);//(classNameModelFullPath, getMethodName, miGrid, listSubGrids);
        this.clase = clase;
    }

    public Response loadData(int action,
            int startIndex,
            Map filteredColumns,
            ArrayList currentSortedColumns,
            ArrayList currentSortedVersusColumns,
            Class valueObjectType,
            Map otherGridParams) {
        List al;
        if (beanVO != null) {
            Session s = null;

            try {
                String sql = "FROM " + RangoValor.class.getName() + " C ";
                if (clase.equals(TimbreMunicipal.class)) {
                    sql += " WHERE C.timbreMunicipal.id=?";
                }
                if (clase.equals(ConfiguracionProntoPago.class)) {
                     sql += " WHERE C.prontoPago.id=?";
                }
                SessionFactory sf = HibernateUtil.getSessionFactory();
                s = sf.openSession();
                Response res = HibernateUtils.getBlockFromQuery(
                        action,
                        startIndex,
                        General.licencia.getBlockSize(),
                        filteredColumns,
                        currentSortedColumns,
                        currentSortedVersusColumns,
                        valueObjectType,
                        sql,
                        new Object[]{((Auditable) beanVO).getId()},
                        new Type[]{new LongType()},
                        "C",
                        sf,
                        s);
                return res;
            } catch (Exception ex) {
                LoggerUtil.error(this.getClass(), "loadData", ex);
                return new ErrorResponse(ex.getMessage());
            } finally {
                s.close();
            }
        } else {
            al = new ArrayList<SumaAsegurada>(0);
        }
        return new VOListResponse(al, false, al.size());
    }

    @Override
    public Response insertRecords(int[] rowNumbers, ArrayList newValueObjects) throws Exception {
        Session s = null;
        if (getSet() != null) {
            ValueObject o = (ValueObject) newValueObjects.get(0);
            try {
                s = HibernateUtil.getSessionFactory().openSession();
                Transaction t = s.beginTransaction();
                AuditoriaBasica ab = new AuditoriaBasica(new Date(), General.usuario.getUserName(), true);
                if (o instanceof Auditable) {
                    ((Auditable) o).setAuditoria(ab);
                }
                //getSet().add(o);
                String err = logicaDeNegocios((RangoValor) o);
                if (err != null) {
                    return new ErrorResponse(err);
                }
                if (clase.equals(TimbreMunicipal.class)) {
                    ((RangoValor) o).setTimbreMunicipal((TimbreMunicipal) super.beanVO);
                    ((RangoValor) o).setMontoPorcentual(Boolean.TRUE);
                }
                if (clase.equals(ConfiguracionProntoPago.class)) {
                    ((RangoValor) o).setProntoPago((ConfiguracionProntoPago) super.beanVO);
                    ((RangoValor) o).setMontoPorcentual(Boolean.FALSE);
                }
                //s.update(super.beanVO);
                s.save(o);
                selectedCell(0, 0, null, o);
                t.commit();
                return new VOListResponse(newValueObjects, false, newValueObjects.size());
            } catch (Exception ex) {
                getSet().remove(o);
                return new ErrorResponse(LoggerUtil.isInvalidStateException(this.getClass(), "insertRecords", ex));
            } finally {
                s.close();
            }
        } else {
            return new ErrorResponse("Primero tienes que guardar el Registro Principal");
        }
    }

    @Override
    public Response updateRecords(int[] rowNumbers, ArrayList oldPersistentObjects, ArrayList persistentObjects) throws Exception {
        String err = logicaDeNegocios((RangoValor) persistentObjects.get(0));
        if (err != null) {
            return new ErrorResponse(err);
        }
        return super.updateRecords(rowNumbers, oldPersistentObjects, persistentObjects);
    }

    @Override
    public Response deleteRecords(ArrayList persistentObjects) throws Exception {
        Session s = null;
        try {
            boolean allOk = true;
            s = HibernateUtil.getSessionFactory().openSession();
            Transaction t = s.beginTransaction();
            for (Object o : persistentObjects) {
                s.delete(o);
            }
            try {
                t.commit();
            } catch (Exception ex) {
                LoggerUtil.error(this.getClass(), "deleteRecords", ex);
                t.rollback();
                allOk = false;
            }
            if (allOk) {
                return new VOResponse(true);
            } else {
                return new ErrorResponse("delete.constraint.violation");
            }
        } finally {
            s.close();
        }
    }

    private String logicaDeNegocios(RangoValor ob) {
        if (ob.getMinValue() > ob.getMaxValue()) {
            return "Rango Invalido";
        }
        return null;
    }
}
