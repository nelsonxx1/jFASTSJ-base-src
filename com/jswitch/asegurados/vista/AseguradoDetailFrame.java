package com.jswitch.asegurados.vista;

import com.jswitch.asegurados.controlador.AseguradoDetailFrameController;
import com.jswitch.asegurados.modelo.dominio.Parentesco;
import com.jswitch.asegurados.modelo.maestra.Asegurado;
import com.jswitch.asegurados.modelo.transaccional.Revision;
import com.jswitch.base.controlador.documentosAnexos.TipoDocumentoLookupController;
import com.jswitch.base.controlador.util.DefaultDocumentosAnexosGridController;
import com.jswitch.base.controlador.util.DefaultGridInternalController;
import com.jswitch.base.controlador.util.DefaultLookupControllerPorNombre;
import com.jswitch.base.modelo.entidades.Documento;
import com.jswitch.base.modelo.entidades.NotaTecnica;
import com.jswitch.base.modelo.entidades.Observacion;
import com.jswitch.base.modelo.util.bean.BeanVO;
import com.jswitch.base.vista.util.DefaultDetailFrame;
import com.jswitch.certificados.controlador.CertificadoDetailController;
import com.jswitch.certificados.controlador.CertificadoLookupController;
import com.jswitch.certificados.modelo.maestra.Certificado;
import com.jswitch.certificados.vista.CertificadoDetailFrame;
import com.jswitch.configuracion.modelo.maestra.Plan;
import com.jswitch.configuracion.modelo.dominio.PlazoEspera;
import com.jswitch.persona.controlador.PersonaLookupControllerPorNombre;
import com.jswitch.persona.controlador.PersonasDetailController;
import com.jswitch.persona.modelo.maestra.Rif;
import com.jswitch.persona.vista.RifDialog;
import com.jswitch.siniestros.controlador.PersonaTipoLookupController;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.form.client.Form;
import org.openswing.swing.form.client.FormController;
import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.util.java.Consts;

/**
 *
 * @author Luis Adrian Gonzalez 
 */
public class AseguradoDetailFrame extends DefaultDetailFrame {

    protected DefaultDocumentosAnexosGridController controllerDocumentosAnexosX;
    protected DefaultGridInternalController controllerObservaciones;
    protected DefaultGridInternalController controllerNotasTecnicas;
protected DefaultGridInternalController controllerRevisiones;
    public AseguradoDetailFrame() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        editButton1 = new org.openswing.swing.client.EditButton();
        saveButton1 = new org.openswing.swing.client.SaveButton();
        reloadButton1 = new org.openswing.swing.client.ReloadButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        form1 = new org.openswing.swing.form.client.Form();
        jPanel2 = new javax.swing.JPanel();
        labelControl1 = new org.openswing.swing.client.LabelControl();
        numericControl1 = new org.openswing.swing.client.NumericControl();
        labelControl2 = new org.openswing.swing.client.LabelControl();
        codLookupControl1 = new org.openswing.swing.client.CodLookupControl();
        labelControl3 = new org.openswing.swing.client.LabelControl();
        codLookupControl2 = new org.openswing.swing.client.CodLookupControl();
        labelControl4 = new org.openswing.swing.client.LabelControl();
        codLookupControl3 = new org.openswing.swing.client.CodLookupControl();
        labelControl5 = new org.openswing.swing.client.LabelControl();
        codLookupControl4 = new org.openswing.swing.client.CodLookupControl();
        dateControl1 = new org.openswing.swing.client.DateControl();
        dateControl2 = new org.openswing.swing.client.DateControl();
        labelControl6 = new org.openswing.swing.client.LabelControl();
        labelControl7 = new org.openswing.swing.client.LabelControl();
        numericControl5 = new org.openswing.swing.client.NumericControl();
        checkBoxControl2 = new org.openswing.swing.client.CheckBoxControl();
        numericControl6 = new org.openswing.swing.client.NumericControl();
        labelControl11 = new org.openswing.swing.client.LabelControl();
        numericControl7 = new org.openswing.swing.client.NumericControl();
        labelControl12 = new org.openswing.swing.client.LabelControl();
        labelControl13 = new org.openswing.swing.client.LabelControl();
        labelControl8 = new org.openswing.swing.client.LabelControl();
        codLookupControl5 = new org.openswing.swing.client.CodLookupControl();
        observaciones = new javax.swing.JPanel();
        jPanelObs = new javax.swing.JPanel();
        gridControlObs = new org.openswing.swing.client.GridControl();
        decimalColumnObs = new org.openswing.swing.table.columns.client.DecimalColumn();
        textColumnObs1 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumnObs2 = new org.openswing.swing.table.columns.client.TextColumn();
        dateTimeColumnObs1 = new org.openswing.swing.table.columns.client.DateTimeColumn();
        textColumnObs3 = new org.openswing.swing.table.columns.client.TextColumn();
        dateTimeColumnObs2 = new org.openswing.swing.table.columns.client.DateTimeColumn();
        jPanel13 = new javax.swing.JPanel();
        insertButtonObs = new org.openswing.swing.client.InsertButton();
        editButtonObs = new org.openswing.swing.client.EditButton();
        deleteButtonObs = new org.openswing.swing.client.DeleteButton();
        saveButtonObs = new org.openswing.swing.client.SaveButton();
        reloadButtonObs = new org.openswing.swing.client.ReloadButton();
        notasTecnicas = new javax.swing.JPanel();
        jPanelNot = new javax.swing.JPanel();
        gridControlNot = new org.openswing.swing.client.GridControl();
        decimalColumnNot = new org.openswing.swing.table.columns.client.DecimalColumn();
        textColumnNot1 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumnNot2 = new org.openswing.swing.table.columns.client.TextColumn();
        dateTimeColumn1 = new org.openswing.swing.table.columns.client.DateTimeColumn();
        textColumnNot3 = new org.openswing.swing.table.columns.client.TextColumn();
        dateTimeColumn2 = new org.openswing.swing.table.columns.client.DateTimeColumn();
        jPanel15 = new javax.swing.JPanel();
        insertButtonNot = new org.openswing.swing.client.InsertButton();
        saveButtonNot = new org.openswing.swing.client.SaveButton();
        reloadButtonNot = new org.openswing.swing.client.ReloadButton();
        DocAnexos = new javax.swing.JPanel();
        jPanelDoc = new javax.swing.JPanel();
        gridControlDoc = new org.openswing.swing.client.GridControl();
        buttonColumnDoc = new org.openswing.swing.table.columns.client.ButtonColumn();
        integerColumnDoc = new org.openswing.swing.table.columns.client.IntegerColumn();
        codLookupColumnDoc = new org.openswing.swing.table.columns.client.CodLookupColumn();
        textColumnDoc = new org.openswing.swing.table.columns.client.TextColumn();
        dateColumnDoc = new org.openswing.swing.table.columns.client.DateColumn();
        jPanel11 = new javax.swing.JPanel();
        insertButtonDoc = new org.openswing.swing.client.InsertButton();
        editButtonDoc = new org.openswing.swing.client.EditButton();
        deleteButtonDoc = new org.openswing.swing.client.DeleteButton();
        saveButtonDoc = new org.openswing.swing.client.SaveButton();
        reloadButtonDoc = new org.openswing.swing.client.ReloadButton();
        filterButtonDoc = new org.openswing.swing.client.FilterButton();
        reviciones = new javax.swing.JPanel();
        jPanelNot1 = new javax.swing.JPanel();
        gridControlNot1 = new org.openswing.swing.client.GridControl();
        decimalColumnNot1 = new org.openswing.swing.table.columns.client.DecimalColumn();
        textColumnNot4 = new org.openswing.swing.table.columns.client.TextColumn();
        codLookupColumn1 = new org.openswing.swing.table.columns.client.CodLookupColumn();
        textColumnNot6 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumnNot5 = new org.openswing.swing.table.columns.client.TextColumn();
        dateTimeColumn3 = new org.openswing.swing.table.columns.client.DateTimeColumn();
        jPanel16 = new javax.swing.JPanel();
        insertButtonNot1 = new org.openswing.swing.client.InsertButton();
        saveButtonNot1 = new org.openswing.swing.client.SaveButton();
        reloadButtonNot1 = new org.openswing.swing.client.ReloadButton();

        setTitle("Asegurado");

        jButton1.setBackground(java.awt.Color.red);
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Siniestros");

        jButton2.setBackground(java.awt.Color.green);
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Crear Siniestro ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reloadButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(reloadButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(saveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        form1.setVOClassName(Asegurado.class.getName());
        form1.setEditButton(editButton1);
        form1.setReloadButton(reloadButton1);
        form1.setSaveButton(saveButton1);
        form1.setLayout(new java.awt.GridLayout(1, 2));

        labelControl1.setLabel("id");

        numericControl1.setAttributeName("id");
        numericControl1.setEnabledOnEdit(false);
        numericControl1.setEnabledOnInsert(false);

        labelControl2.setLabel("asegurado.persona");

        codLookupControl1.setAttributeName("persona.nombreLargo");
        codLookupControl1.setControllerMethodName("getPersonaNueva");
        codLookupControl1.setMaxCharacters(50);
        codLookupControl1.setRequired(true);

        labelControl3.setLabel("asegurado.parentesco");

        codLookupControl2.setAttributeName("parentesco.nombre");
        codLookupControl2.setControllerMethodName("getParentesco");
        codLookupControl2.setMaxCharacters(50);
        codLookupControl2.setRequired(true);

        labelControl4.setLabel("asegurado.plazoEspera");

        codLookupControl3.setAttributeName("plazoEspera.nombre");
        codLookupControl3.setControllerMethodName("getPlazoEspera");
        codLookupControl3.setMaxCharacters(50);
        codLookupControl3.setRequired(true);

        labelControl5.setLabel("asegurado.plan");

        codLookupControl4.setAttributeName("plan.nombre");
        codLookupControl4.setControllerMethodName("getPlan");
        codLookupControl4.setMaxCharacters(50);
        codLookupControl4.setRequired(true);

        dateControl1.setAttributeName("fechaIngresoFondo");
        dateControl1.setRequired(true);

        dateControl2.setAttributeName("fechaEgresoFondo");
        dateControl2.setEnabledOnInsert(false);

        labelControl6.setLabel("asegurado.fechaIngreso");

        labelControl7.setLabel("asegurado.fechaEgreso");

        numericControl5.setAttributeName("primaTotal");
        numericControl5.setDecimals(2);
        numericControl5.setEnabledOnEdit(false);
        numericControl5.setEnabledOnInsert(false);
        numericControl5.setRequired(true);

        checkBoxControl2.setText("auditoria.activo");
        checkBoxControl2.setAttributeName("auditoria.activo");

        numericControl6.setAttributeName("primaAporte");
        numericControl6.setDecimals(2);
        numericControl6.setEnabledOnEdit(false);
        numericControl6.setEnabledOnInsert(false);
        numericControl6.setRequired(true);

        labelControl11.setLabel("asegurado.primaAsegurado");

        numericControl7.setAttributeName("primaAsegurado");
        numericControl7.setDecimals(2);
        numericControl7.setEnabledOnEdit(false);
        numericControl7.setEnabledOnInsert(false);
        numericControl7.setRequired(true);

        labelControl12.setLabel("asegurado.primaTotal");

        labelControl13.setLabel("asegurado.primaAporte");

        labelControl8.setLabel("titular.nombreLargo");

        codLookupControl5.setAttributeName("certificado.titular.persona.nombreLargo");
        codLookupControl5.setEnabledOnEdit(false);
        codLookupControl5.setEnabledOnInsert(false);
        codLookupControl5.setLookupButtonVisible(false);
        codLookupControl5.setMaxCharacters(50);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBoxControl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numericControl1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelControl8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codLookupControl5, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelControl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codLookupControl4, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelControl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codLookupControl1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelControl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(codLookupControl2, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                            .addComponent(codLookupControl3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelControl11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numericControl7, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelControl7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateControl2, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelControl6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateControl1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelControl13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numericControl6, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelControl12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numericControl5, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {checkBoxControl2, labelControl1, labelControl11, labelControl12, labelControl13, labelControl2, labelControl3, labelControl4, labelControl5, labelControl6, labelControl7, labelControl8});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numericControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codLookupControl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codLookupControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codLookupControl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codLookupControl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codLookupControl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numericControl6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numericControl7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numericControl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateControl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxControl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {codLookupControl1, codLookupControl2, codLookupControl3, codLookupControl4, codLookupControl5, dateControl1, dateControl2, labelControl1, labelControl11, labelControl12, labelControl13, labelControl2, labelControl3, labelControl4, labelControl5, labelControl6, labelControl7, labelControl8, numericControl1, numericControl5, numericControl6, numericControl7});

        form1.add(jPanel2);

        jTabbedPane1.addTab("Detalle de Asegurado", form1);

        jPanelObs.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        gridControlObs.setDeleteButton(deleteButtonObs);
        gridControlObs.setEditButton(editButtonObs);
        gridControlObs.setInsertButton(insertButtonObs);
        gridControlObs.setMaxNumberOfRowsOnInsert(4);
        gridControlObs.setReloadButton(reloadButtonObs);
        gridControlObs.setSaveButton(saveButtonObs);
        gridControlObs.setValueObjectClassName(Observacion.class.getName());
        gridControlObs.setVisibleStatusPanel(false);

        decimalColumnObs.setColumnName("id");
        decimalColumnObs.setColumnRequired(false);
        decimalColumnObs.setColumnVisible(false);
        decimalColumnObs.setPreferredWidth(40);
        gridControlObs.getColumnContainer().add(decimalColumnObs);

        textColumnObs1.setColumnName("observacion");
        textColumnObs1.setEditableOnEdit(true);
        textColumnObs1.setEditableOnInsert(true);
        textColumnObs1.setMaxCharacters(1024);
        textColumnObs1.setPreferredWidth(400);
        gridControlObs.getColumnContainer().add(textColumnObs1);

        textColumnObs2.setColumnName("auditoria.usuarioInsert");
        textColumnObs2.setColumnRequired(false);
        gridControlObs.getColumnContainer().add(textColumnObs2);

        dateTimeColumnObs1.setColumnName("auditoria.fechaInsert");
        dateTimeColumnObs1.setColumnRequired(false);
        dateTimeColumnObs1.setColumnSortable(true);
        dateTimeColumnObs1.setSortVersus(org.openswing.swing.util.java.Consts.DESC_SORTED);
        gridControlObs.getColumnContainer().add(dateTimeColumnObs1);

        textColumnObs3.setColumnFilterable(true);
        textColumnObs3.setColumnName("auditoria.usuarioUpdate");
        textColumnObs3.setColumnRequired(false);
        textColumnObs3.setColumnSortable(true);
        gridControlObs.getColumnContainer().add(textColumnObs3);

        dateTimeColumnObs2.setColumnFilterable(true);
        dateTimeColumnObs2.setColumnName("auditoria.fechaUpdate");
        dateTimeColumnObs2.setColumnRequired(false);
        dateTimeColumnObs2.setColumnSortable(true);
        gridControlObs.getColumnContainer().add(dateTimeColumnObs2);

        jPanel13.setLayout(new java.awt.GridLayout(3, 2, 2, 2));
        jPanel13.add(insertButtonObs);
        jPanel13.add(editButtonObs);
        jPanel13.add(deleteButtonObs);
        jPanel13.add(saveButtonObs);
        jPanel13.add(reloadButtonObs);

        javax.swing.GroupLayout jPanelObsLayout = new javax.swing.GroupLayout(jPanelObs);
        jPanelObs.setLayout(jPanelObsLayout);
        jPanelObsLayout.setHorizontalGroup(
            jPanelObsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelObsLayout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridControlObs, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE))
        );
        jPanelObsLayout.setVerticalGroup(
            jPanelObsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelObsLayout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
            .addComponent(gridControlObs, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout observacionesLayout = new javax.swing.GroupLayout(observaciones);
        observaciones.setLayout(observacionesLayout);
        observacionesLayout.setHorizontalGroup(
            observacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
            .addGroup(observacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(observacionesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelObs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        observacionesLayout.setVerticalGroup(
            observacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
            .addGroup(observacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(observacionesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelObs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("Observaciones", observaciones);

        jPanelNot.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        gridControlNot.setInsertButton(insertButtonNot);
        gridControlNot.setMaxNumberOfRowsOnInsert(4);
        gridControlNot.setReloadButton(reloadButtonNot);
        gridControlNot.setSaveButton(saveButtonNot);
        gridControlNot.setValueObjectClassName(NotaTecnica.class.getName());
        gridControlNot.setVisibleStatusPanel(false);

        decimalColumnNot.setColumnName("id");
        decimalColumnNot.setColumnRequired(false);
        decimalColumnNot.setColumnVisible(false);
        decimalColumnNot.setPreferredWidth(40);
        gridControlNot.getColumnContainer().add(decimalColumnNot);

        textColumnNot1.setColumnName("observacion");
        textColumnNot1.setEditableOnEdit(true);
        textColumnNot1.setEditableOnInsert(true);
        textColumnNot1.setMaxCharacters(1024);
        textColumnNot1.setPreferredWidth(400);
        gridControlNot.getColumnContainer().add(textColumnNot1);

        textColumnNot2.setColumnName("auditoria.usuarioInsert");
        textColumnNot2.setColumnRequired(false);
        gridControlNot.getColumnContainer().add(textColumnNot2);

        dateTimeColumn1.setColumnName("auditoria.fechaInsert");
        dateTimeColumn1.setColumnRequired(false);
        dateTimeColumn1.setColumnSortable(true);
        dateTimeColumn1.setSortVersus(org.openswing.swing.util.java.Consts.DESC_SORTED);
        gridControlNot.getColumnContainer().add(dateTimeColumn1);

        textColumnNot3.setColumnFilterable(true);
        textColumnNot3.setColumnName("auditoria.usuarioUpdate");
        textColumnNot3.setColumnRequired(false);
        textColumnNot3.setColumnSortable(true);
        gridControlNot.getColumnContainer().add(textColumnNot3);

        dateTimeColumn2.setColumnFilterable(true);
        dateTimeColumn2.setColumnName("auditoria.fechaUpdate");
        dateTimeColumn2.setColumnRequired(false);
        dateTimeColumn2.setColumnSortable(true);
        gridControlNot.getColumnContainer().add(dateTimeColumn2);

        jPanel15.setLayout(new java.awt.GridLayout(3, 2, 2, 2));
        jPanel15.add(insertButtonNot);
        jPanel15.add(saveButtonNot);
        jPanel15.add(reloadButtonNot);

        javax.swing.GroupLayout jPanelNotLayout = new javax.swing.GroupLayout(jPanelNot);
        jPanelNot.setLayout(jPanelNotLayout);
        jPanelNotLayout.setHorizontalGroup(
            jPanelNotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNotLayout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridControlNot, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE))
        );
        jPanelNotLayout.setVerticalGroup(
            jPanelNotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNotLayout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
            .addComponent(gridControlNot, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout notasTecnicasLayout = new javax.swing.GroupLayout(notasTecnicas);
        notasTecnicas.setLayout(notasTecnicasLayout);
        notasTecnicasLayout.setHorizontalGroup(
            notasTecnicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
            .addGroup(notasTecnicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(notasTecnicasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelNot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        notasTecnicasLayout.setVerticalGroup(
            notasTecnicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
            .addGroup(notasTecnicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(notasTecnicasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelNot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("Notas Tecnicas", notasTecnicas);

        jPanelDoc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        gridControlDoc.setDeleteButton(deleteButtonDoc);
        gridControlDoc.setEditButton(editButtonDoc);
        gridControlDoc.setFilterButton(filterButtonDoc);
        gridControlDoc.setInsertButton(insertButtonDoc);
        gridControlDoc.setMaxNumberOfRowsOnInsert(4);
        gridControlDoc.setReloadButton(reloadButtonDoc);
        gridControlDoc.setSaveButton(saveButtonDoc);
        gridControlDoc.setValueObjectClassName(Documento.class.getName());
        gridControlDoc.setVisibleStatusPanel(false);

        buttonColumnDoc.setColumnName("button");
        buttonColumnDoc.setEditableOnEdit(true);
        buttonColumnDoc.setEnableInReadOnlyMode(true);
        buttonColumnDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png"))); // NOI18N
        buttonColumnDoc.setPreferredWidth(20);
        buttonColumnDoc.setText("");
        gridControlDoc.getColumnContainer().add(buttonColumnDoc);

        integerColumnDoc.setColumnName("id");
        integerColumnDoc.setColumnRequired(false);
        integerColumnDoc.setPreferredWidth(40);
        gridControlDoc.getColumnContainer().add(integerColumnDoc);

        codLookupColumnDoc.setColumnName("tipoDocumento.nombre");
        codLookupColumnDoc.setControllerMethodName("getTipoDocAnex");
        codLookupColumnDoc.setEditableOnEdit(true);
        codLookupColumnDoc.setEditableOnInsert(true);
        gridControlDoc.getColumnContainer().add(codLookupColumnDoc);

        textColumnDoc.setColumnName("observacion");
        textColumnDoc.setColumnRequired(false);
        textColumnDoc.setEditableOnEdit(true);
        textColumnDoc.setEditableOnInsert(true);
        gridControlDoc.getColumnContainer().add(textColumnDoc);

        dateColumnDoc.setColumnName("fechaVencimiento");
        dateColumnDoc.setColumnRequired(false);
        dateColumnDoc.setEditableOnEdit(true);
        dateColumnDoc.setEditableOnInsert(true);
        gridControlDoc.getColumnContainer().add(dateColumnDoc);

        jPanel11.setLayout(new java.awt.GridLayout(3, 2, 2, 2));
        jPanel11.add(insertButtonDoc);
        jPanel11.add(editButtonDoc);
        jPanel11.add(deleteButtonDoc);
        jPanel11.add(saveButtonDoc);
        jPanel11.add(reloadButtonDoc);
        jPanel11.add(filterButtonDoc);

        javax.swing.GroupLayout jPanelDocLayout = new javax.swing.GroupLayout(jPanelDoc);
        jPanelDoc.setLayout(jPanelDocLayout);
        jPanelDocLayout.setHorizontalGroup(
            jPanelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDocLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridControlDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDocLayout.setVerticalGroup(
            jPanelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDocLayout.createSequentialGroup()
                .addGroup(jPanelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gridControlDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout DocAnexosLayout = new javax.swing.GroupLayout(DocAnexos);
        DocAnexos.setLayout(DocAnexosLayout);
        DocAnexosLayout.setHorizontalGroup(
            DocAnexosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
            .addGroup(DocAnexosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DocAnexosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        DocAnexosLayout.setVerticalGroup(
            DocAnexosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
            .addGroup(DocAnexosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DocAnexosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("Documentos Anexos", DocAnexos);

        jPanelNot1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        gridControlNot1.setInsertButton(insertButtonNot1);
        gridControlNot1.setMaxNumberOfRowsOnInsert(4);
        gridControlNot1.setReloadButton(reloadButtonNot1);
        gridControlNot1.setSaveButton(saveButtonNot1);
        gridControlNot1.setValueObjectClassName(Revision.class.getName());
        gridControlNot1.setVisibleStatusPanel(false);

        decimalColumnNot1.setColumnName("id");
        decimalColumnNot1.setColumnRequired(false);
        decimalColumnNot1.setColumnVisible(false);
        decimalColumnNot1.setPreferredWidth(40);
        gridControlNot1.getColumnContainer().add(decimalColumnNot1);

        textColumnNot4.setColumnName("personaBuscadora.rif.rif");
        textColumnNot4.setColumnRequired(false);
        textColumnNot4.setMaxCharacters(1024);
        gridControlNot1.getColumnContainer().add(textColumnNot4);

        codLookupColumn1.setColumnName("personaBuscadora.nombreLargo");
        codLookupColumn1.setEditableOnEdit(true);
        codLookupColumn1.setEditableOnInsert(true);
        codLookupColumn1.setPreferredWidth(200);
        gridControlNot1.getColumnContainer().add(codLookupColumn1);

        textColumnNot6.setColumnName("detalle");
        textColumnNot6.setColumnRequired(false);
        textColumnNot6.setEditableOnInsert(true);
        gridControlNot1.getColumnContainer().add(textColumnNot6);

        textColumnNot5.setColumnName("auditoria.usuarioInsert");
        textColumnNot5.setColumnRequired(false);
        gridControlNot1.getColumnContainer().add(textColumnNot5);

        dateTimeColumn3.setColumnName("auditoria.fechaInsert");
        dateTimeColumn3.setColumnRequired(false);
        dateTimeColumn3.setSortVersus(org.openswing.swing.util.java.Consts.DESC_SORTED);
        gridControlNot1.getColumnContainer().add(dateTimeColumn3);

        jPanel16.setLayout(new java.awt.GridLayout(3, 2, 2, 2));
        jPanel16.add(insertButtonNot1);
        jPanel16.add(saveButtonNot1);
        jPanel16.add(reloadButtonNot1);

        javax.swing.GroupLayout jPanelNot1Layout = new javax.swing.GroupLayout(jPanelNot1);
        jPanelNot1.setLayout(jPanelNot1Layout);
        jPanelNot1Layout.setHorizontalGroup(
            jPanelNot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNot1Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridControlNot1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE))
        );
        jPanelNot1Layout.setVerticalGroup(
            jPanelNot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNot1Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
            .addComponent(gridControlNot1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout revicionesLayout = new javax.swing.GroupLayout(reviciones);
        reviciones.setLayout(revicionesLayout);
        revicionesLayout.setHorizontalGroup(
            revicionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
            .addGroup(revicionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(revicionesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelNot1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        revicionesLayout.setVerticalGroup(
            revicionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
            .addGroup(revicionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(revicionesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelNot1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("Reviciones", reviciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void inicializar(FormController formController, boolean addToMDIFrame) {
        initComponents();

        //<editor-fold defaultstate="collapsed" desc="modulo de obs, not and doc">
        org.openswing.swing.table.columns.client.PictureCaptureColumn pcc =
                new org.openswing.swing.table.columns.client.PictureCaptureColumn();
        pcc.setColumnName("file");
        pcc.setEditableOnInsert(true);
        pcc.setEditableOnEdit(false);
        pcc.setFileNameAttributeName("fileName");
        pcc.setPreferredWidth(220);
        gridControlDoc.getColumnContainer().add(pcc);
        controllerDocumentosAnexosX = new DefaultDocumentosAnexosGridController(Asegurado.class, gridControlDoc);
        buttonColumnDoc.addActionListener(controllerDocumentosAnexosX);
        gridControlDoc.setController(controllerDocumentosAnexosX);
        gridControlDoc.setGridDataLocator(controllerDocumentosAnexosX);

        com.jswitch.base.controlador.documentosAnexos.TipoDocumentoLookupController lookupDocumentoAnexo2 =
                new TipoDocumentoLookupController(com.jswitch.base.modelo.Dominios.Modulos.ASEGURADOS);
        lookupDocumentoAnexo2.addLookup2ParentLink("tipoDocumento");
        codLookupColumnDoc.setLookupController(lookupDocumentoAnexo2);

        controllerObservaciones =
                new DefaultGridInternalController(Asegurado.class.getName(), "getObservaciones", gridControlObs);
        gridControlObs.setGridDataLocator(controllerObservaciones);
        gridControlObs.setController(controllerObservaciones);

        controllerRevisiones =
                new DefaultGridInternalController(Asegurado.class.getName(), "getRevisiones", gridControlNot1);
        gridControlNot1.setGridDataLocator(controllerRevisiones);
        gridControlNot1.setController(controllerRevisiones);

        controllerNotasTecnicas =
                new DefaultGridInternalController(Asegurado.class.getName(), "getNotasTecnicas", gridControlNot);
        gridControlNot.setGridDataLocator(controllerNotasTecnicas);
        gridControlNot.setController(controllerNotasTecnicas);
        //</editor-fold>


        jButton1.addActionListener((AseguradoDetailFrameController) formController);
        jButton2.addActionListener((AseguradoDetailFrameController) formController);
        PersonaLookupControllerPorNombre lookupPersonas = new PersonaLookupControllerPorNombre(
                "ASE");
        lookupPersonas.addLookup2ParentLink("persona");
        codLookupControl1.setLookupController(lookupPersonas);
        codLookupControl1.setOpenDetail("persona", PersonasDetailController.class.getName(), new Class[]{GridControl.class, BeanVO.class, Rif.class}, new Object[]{null, null, null}, 1);
        codLookupControl1.setNewDetail("persona", RifDialog.class.getName(), new Class[]{Form.class, String.class, Object[].class}, new Object[]{null, null, new Object[]{"ASE"}}, 0);

        CertificadoLookupController loo = new CertificadoLookupController(Certificado.class.getName());
        loo.addLookup2ParentLink("certificado");
        codLookupControl5.setLookupController(loo);

        codLookupControl5.setOpenDetail("certificado",
                CertificadoDetailController.class.getName(),
                new Class[]{String.class, GridControl.class, BeanVO.class,
                    BeanVO.class, Boolean.class},
                new Object[]{CertificadoDetailFrame.class.getName(), null, null, null, false}, 2);

        DefaultLookupControllerPorNombre lookupParentesco = new DefaultLookupControllerPorNombre(
                Parentesco.class.getName());
        lookupParentesco.addLookup2ParentLink("parentesco");
        codLookupControl2.setLookupController(lookupParentesco);

        DefaultLookupControllerPorNombre lookupPlazoEspera = new DefaultLookupControllerPorNombre(
                PlazoEspera.class.getName());
        lookupPlazoEspera.addLookup2ParentLink("plazoEspera");
        codLookupControl3.setLookupController(lookupPlazoEspera);

        DefaultLookupControllerPorNombre lookupPlan = new DefaultLookupControllerPorNombre(
                Plan.class.getName());
        lookupPlan.addLookup2ParentLink("plan");
        codLookupControl4.setLookupController(lookupPlan);

        String[] tipoPersonaPago = tipoPersonaPago = new String[]{"CLI", "MED", "LAB"};

        PersonaTipoLookupController lookupBuscador = new PersonaTipoLookupController(tipoPersonaPago);
        lookupBuscador.addLookup2ParentLink("personaBuscadora");
        codLookupColumn1.setLookupController(lookupBuscador);


        form1.setCreateInnerVO(false);
        form1.setFormController(formController);
        if (addToMDIFrame) {
            pack();
        } else {
            setBounds(0, 0, 0, 0);
        }

        MDIFrame.add(this);
    }

    @Override
    public void saveGridsData() {
    }

    @Override
    public void reloadGridsData() {
    }

    @Override
    public void clearGridsData() {
    }

    @Override
    public void setOwnerVO(BeanVO beanVO) {
        Long id = null;
        if (beanVO != null) {
            id = ((Asegurado) beanVO).getId();
        }
        controllerDocumentosAnexosX.setBeanVO(beanVO, id);
        controllerObservaciones.setBeanVO(beanVO);
        controllerNotasTecnicas.setBeanVO(beanVO);
        controllerRevisiones.setBeanVO(beanVO);
        reloadGridsData();
    }

    @Override
    public Form getMainPanel() {
        return form1;
    }

    @Override
    public void modeChanged(int currentMode) {
        if (currentMode == Consts.INSERT) {
            clearGridsData();
        }
        if (currentMode == Consts.INSERT) {
            setEnableGridInternalButtons(false);
        } else {
            setEnableGridInternalButtons(true);
        }
    }

    private void setEnableGridInternalButtons(boolean enabled) {
        jPanelDoc.setVisible(enabled);
        jPanelNot.setVisible(enabled);
        jPanelObs.setVisible(enabled);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DocAnexos;
    private org.openswing.swing.table.columns.client.ButtonColumn buttonColumnDoc;
    private org.openswing.swing.client.CheckBoxControl checkBoxControl2;
    private org.openswing.swing.table.columns.client.CodLookupColumn codLookupColumn1;
    private org.openswing.swing.table.columns.client.CodLookupColumn codLookupColumnDoc;
    private org.openswing.swing.client.CodLookupControl codLookupControl1;
    private org.openswing.swing.client.CodLookupControl codLookupControl2;
    private org.openswing.swing.client.CodLookupControl codLookupControl3;
    private org.openswing.swing.client.CodLookupControl codLookupControl4;
    private org.openswing.swing.client.CodLookupControl codLookupControl5;
    private org.openswing.swing.table.columns.client.DateColumn dateColumnDoc;
    private org.openswing.swing.client.DateControl dateControl1;
    private org.openswing.swing.client.DateControl dateControl2;
    private org.openswing.swing.table.columns.client.DateTimeColumn dateTimeColumn1;
    private org.openswing.swing.table.columns.client.DateTimeColumn dateTimeColumn2;
    private org.openswing.swing.table.columns.client.DateTimeColumn dateTimeColumn3;
    private org.openswing.swing.table.columns.client.DateTimeColumn dateTimeColumnObs1;
    private org.openswing.swing.table.columns.client.DateTimeColumn dateTimeColumnObs2;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumnNot;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumnNot1;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumnObs;
    private org.openswing.swing.client.DeleteButton deleteButtonDoc;
    private org.openswing.swing.client.DeleteButton deleteButtonObs;
    private org.openswing.swing.client.EditButton editButton1;
    private org.openswing.swing.client.EditButton editButtonDoc;
    private org.openswing.swing.client.EditButton editButtonObs;
    private org.openswing.swing.client.FilterButton filterButtonDoc;
    private org.openswing.swing.form.client.Form form1;
    private org.openswing.swing.client.GridControl gridControlDoc;
    private org.openswing.swing.client.GridControl gridControlNot;
    private org.openswing.swing.client.GridControl gridControlNot1;
    private org.openswing.swing.client.GridControl gridControlObs;
    private org.openswing.swing.client.InsertButton insertButtonDoc;
    private org.openswing.swing.client.InsertButton insertButtonNot;
    private org.openswing.swing.client.InsertButton insertButtonNot1;
    private org.openswing.swing.client.InsertButton insertButtonObs;
    private org.openswing.swing.table.columns.client.IntegerColumn integerColumnDoc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelDoc;
    private javax.swing.JPanel jPanelNot;
    private javax.swing.JPanel jPanelNot1;
    private javax.swing.JPanel jPanelObs;
    private javax.swing.JTabbedPane jTabbedPane1;
    private org.openswing.swing.client.LabelControl labelControl1;
    private org.openswing.swing.client.LabelControl labelControl11;
    private org.openswing.swing.client.LabelControl labelControl12;
    private org.openswing.swing.client.LabelControl labelControl13;
    private org.openswing.swing.client.LabelControl labelControl2;
    private org.openswing.swing.client.LabelControl labelControl3;
    private org.openswing.swing.client.LabelControl labelControl4;
    private org.openswing.swing.client.LabelControl labelControl5;
    private org.openswing.swing.client.LabelControl labelControl6;
    private org.openswing.swing.client.LabelControl labelControl7;
    private org.openswing.swing.client.LabelControl labelControl8;
    private javax.swing.JPanel notasTecnicas;
    private org.openswing.swing.client.NumericControl numericControl1;
    private org.openswing.swing.client.NumericControl numericControl5;
    private org.openswing.swing.client.NumericControl numericControl6;
    private org.openswing.swing.client.NumericControl numericControl7;
    private javax.swing.JPanel observaciones;
    private org.openswing.swing.client.ReloadButton reloadButton1;
    private org.openswing.swing.client.ReloadButton reloadButtonDoc;
    private org.openswing.swing.client.ReloadButton reloadButtonNot;
    private org.openswing.swing.client.ReloadButton reloadButtonNot1;
    private org.openswing.swing.client.ReloadButton reloadButtonObs;
    private javax.swing.JPanel reviciones;
    private org.openswing.swing.client.SaveButton saveButton1;
    private org.openswing.swing.client.SaveButton saveButtonDoc;
    private org.openswing.swing.client.SaveButton saveButtonNot;
    private org.openswing.swing.client.SaveButton saveButtonNot1;
    private org.openswing.swing.client.SaveButton saveButtonObs;
    private org.openswing.swing.table.columns.client.TextColumn textColumnDoc;
    private org.openswing.swing.table.columns.client.TextColumn textColumnNot1;
    private org.openswing.swing.table.columns.client.TextColumn textColumnNot2;
    private org.openswing.swing.table.columns.client.TextColumn textColumnNot3;
    private org.openswing.swing.table.columns.client.TextColumn textColumnNot4;
    private org.openswing.swing.table.columns.client.TextColumn textColumnNot5;
    private org.openswing.swing.table.columns.client.TextColumn textColumnNot6;
    private org.openswing.swing.table.columns.client.TextColumn textColumnObs1;
    private org.openswing.swing.table.columns.client.TextColumn textColumnObs2;
    private org.openswing.swing.table.columns.client.TextColumn textColumnObs3;
    // End of variables declaration//GEN-END:variables
}
