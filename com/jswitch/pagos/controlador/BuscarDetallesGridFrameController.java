package com.jswitch.pagos.controlador;

import com.jswitch.base.controlador.logger.LoggerUtil;
import com.jswitch.base.controlador.util.DefaultGridFrameController;
import com.jswitch.base.modelo.HibernateUtil;
import com.jswitch.pagos.modelo.maestra.OrdenDePago;
import com.jswitch.pagos.vista.BuscaDetallesGridFrame;
import com.jswitch.persona.modelo.maestra.Persona;
import com.jswitch.siniestros.modelo.dominio.EtapaSiniestro;
import com.jswitch.siniestros.modelo.maestra.DetalleSiniestro;
import com.jswitch.siniestros.vista.detalle.DetalleSiniestroDetailFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Map;
import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;
import org.hibernate.type.Type;
import org.openswing.swing.client.CheckBoxControl;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.ValueObject;
import org.openswing.swing.table.model.client.VOListTableModel;
import org.openswing.swing.util.server.HibernateUtils;

/**
 *
 * @author Adrian
 */
public class BuscarDetallesGridFrameController extends DefaultGridFrameController
        implements ActionListener {

    private Persona personaPago;
    private OrdenDePago ordenDePago;
    private OrdenDePagoDetailFrameController controller;

    public BuscarDetallesGridFrameController(OrdenDePagoDetailFrameController controller, OrdenDePago ordenDePago) {
        super(BuscaDetallesGridFrame.class.getName(), DetalleSiniestroDetailFrame.class.getName(),
                ordenDePago.getTipoDetalleSiniestro().getClase(), null);
        this.personaPago = ordenDePago.getPersonaPago();
        this.ordenDePago = ordenDePago;
        this.controller = controller;
    }

    @Override
    public void doubleClick(int rowNumber, ValueObject persistentObject) {
    }

    @Override
    public Response loadData(int action, int startIndex, Map filteredColumns, ArrayList currentSortedColumns, ArrayList currentSortedVersusColumns, Class valueObjectType, Map otherGridParams) {
        Session s = null;
        try {
            String sql = "FROM " + claseModeloFullPath
                    + " C WHERE C.personaPago.id=? "
                    + "AND C.etapaSiniestro.idPropio=?";
            SessionFactory sf = HibernateUtil.getSessionFactory();
            s = sf.openSession();
            Response res = HibernateUtils.getAllFromQuery(filteredColumns,
                    currentSortedColumns,
                    currentSortedVersusColumns,
                    valueObjectType,
                    sql,
                    new Object[]{personaPago.getId(), "LIQ"},
                    new Type[]{new LongType(), new StringType()},
                    "C", sf, s);
            return res;
        } catch (Exception ex) {
            LoggerUtil.error(this.getClass(), "loadData", ex);
            return new ErrorResponse(ex.getMessage());
        } finally {
            s.close();
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        VOListTableModel model = ((VOListTableModel) gridFrame.getGridControl().
                getTable().getGrid().getModel());

        if (e.getSource() instanceof CheckBoxControl) {
            for (int i = 0; i < model.getRowCount(); i++) {
                model.setField(i, "selected",
                        ((CheckBoxControl) e.getSource()).isSelected());
            }
            gridFrame.getGridControl().repaint();
        } else {
            Session s = null;
            try {
                s = HibernateUtil.getSessionFactory().openSession();
                s.beginTransaction();
                EtapaSiniestro es = (EtapaSiniestro) s.createQuery("FROM "
                        + EtapaSiniestro.class.getName() + " C WHERE "
                        + "idPropio=?").setString(0, "ORD_PAG").uniqueResult();
                for (int i = 0; i < model.getRowCount(); i++) {
                    DetalleSiniestro detalleSin = (DetalleSiniestro) s.get(
                            DetalleSiniestro.class,
                            ((DetalleSiniestro) model.getObjectForRow(i)).getId());

                    if (((DetalleSiniestro) model.getObjectForRow(i)).getSelected()) {
                        Hibernate.initialize(detalleSin.getNotasTecnicas());
                        Hibernate.initialize(detalleSin.getObservaciones());
                        Hibernate.initialize(detalleSin.getPagos());
                        Hibernate.initialize(detalleSin.getDiagnosticoSiniestros());
                        Hibernate.initialize(detalleSin.getDocumentos());
                        detalleSin.setEtapaSiniestro(es);
                        detalleSin.setOrdenDePago(ordenDePago);
                        s.update(detalleSin);
                    }
                }
                s.getTransaction().commit();
                gridFrame.dispose();

            } catch (Exception ex) {
                LoggerUtil.error(this.getClass(), "actionPerformed", ex);
            } finally {
                s.close();
                controller.getVista().getMainPanel().getReloadButton().doClick();
            }
        }
    }
}
