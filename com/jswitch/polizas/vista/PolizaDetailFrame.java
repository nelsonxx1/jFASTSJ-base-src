package com.jswitch.polizas.vista;

import com.jswitch.base.controlador.documentosAnexos.TipoDocumentoLookupController;
import com.jswitch.base.controlador.util.DefaultDocumentosAnexosGridController;
import com.jswitch.base.controlador.util.DefaultGridInternalController;
import com.jswitch.base.modelo.entidades.Documento;
import com.jswitch.base.modelo.entidades.NotaTecnica;
import com.jswitch.base.modelo.entidades.Observacion;
import com.jswitch.base.modelo.util.bean.BeanVO;
import com.jswitch.base.vista.util.DefaultDetailFrame;
import com.jswitch.certificados.controlador.CertificadosGridInternalController;
import com.jswitch.certificados.modelo.maestra.Certificado;
import com.jswitch.polizas.modelo.maestra.Poliza;
import java.awt.event.ActionListener;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.form.client.Form;
import org.openswing.swing.form.client.FormController;
import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.util.java.Consts;

/**
 *
 * @author bc
 */
public class PolizaDetailFrame extends DefaultDetailFrame {

    private CertificadosGridInternalController controller;
    protected DefaultDocumentosAnexosGridController controllerDocumentosAnexosX;
    protected DefaultGridInternalController controllerObservaciones;
    protected DefaultGridInternalController controllerNotasTecnicas;

    public PolizaDetailFrame() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        editButton1 = new org.openswing.swing.client.EditButton();
        saveButton1 = new org.openswing.swing.client.SaveButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        form1 = new org.openswing.swing.form.client.Form();
        jPanel2 = new javax.swing.JPanel();
        labelControl1 = new org.openswing.swing.client.LabelControl();
        numericControl1 = new org.openswing.swing.client.NumericControl();
        labelControl2 = new org.openswing.swing.client.LabelControl();
        checkBoxControl1 = new org.openswing.swing.client.CheckBoxControl();
        textControl1 = new org.openswing.swing.client.TextControl();
        labelControl3 = new org.openswing.swing.client.LabelControl();
        labelControl4 = new org.openswing.swing.client.LabelControl();
        labelControl5 = new org.openswing.swing.client.LabelControl();
        dateControl1 = new org.openswing.swing.client.DateControl();
        dateControl2 = new org.openswing.swing.client.DateControl();
        dateControl3 = new org.openswing.swing.client.DateControl();
        labelControl6 = new org.openswing.swing.client.LabelControl();
        textControl2 = new org.openswing.swing.client.TextControl();
        jPanel12 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        insertButton1 = new org.openswing.swing.client.InsertButton();
        deleteButton1 = new org.openswing.swing.client.DeleteButton();
        reloadButton1 = new org.openswing.swing.client.ReloadButton();
        exportButton1 = new org.openswing.swing.client.ExportButton();
        navigatorBar1 = new org.openswing.swing.client.NavigatorBar();
        filterButton1 = new org.openswing.swing.client.FilterButton();
        editButton2 = new org.openswing.swing.client.EditButton();
        saveButton2 = new org.openswing.swing.client.SaveButton();
        gridData = new org.openswing.swing.client.GridControl();
        decimalColumn1 = new org.openswing.swing.table.columns.client.DecimalColumn();
        textColumn1 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn2 = new org.openswing.swing.table.columns.client.TextColumn();
        checkBoxColumn1 = new org.openswing.swing.table.columns.client.CheckBoxColumn();
        textColumn4 = new org.openswing.swing.table.columns.client.TextColumn();
        dateTimeColumn1 = new org.openswing.swing.table.columns.client.DateTimeColumn();
        textColumn5 = new org.openswing.swing.table.columns.client.TextColumn();
        dateTimeColumn2 = new org.openswing.swing.table.columns.client.DateTimeColumn();
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
        dateTimeColumn3 = new org.openswing.swing.table.columns.client.DateTimeColumn();
        textColumnNot3 = new org.openswing.swing.table.columns.client.TextColumn();
        dateTimeColumn4 = new org.openswing.swing.table.columns.client.DateTimeColumn();
        jPanel15 = new javax.swing.JPanel();
        insertButtonNot = new org.openswing.swing.client.InsertButton();
        saveButtonNot = new org.openswing.swing.client.SaveButton();
        reloadButtonNot = new org.openswing.swing.client.ReloadButton();
        DocAnexos = new javax.swing.JPanel();
        jPanelDoc = new javax.swing.JPanel();
        gridControlDoc = new org.openswing.swing.client.GridControl();
        buttonColumnDoc = new org.openswing.swing.table.columns.client.ButtonColumn();
        decimalColumnNot1 = new org.openswing.swing.table.columns.client.DecimalColumn();
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

        setTitle("Poliza");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(578, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        form1.setVOClassName(Poliza.class.getName());
        form1.setEditButton(editButton1);
        form1.setSaveButton(saveButton1);

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        labelControl1.setLabel("id");

        numericControl1.setAttributeName("id");
        numericControl1.setEnabledOnEdit(false);
        numericControl1.setEnabledOnInsert(false);

        labelControl2.setLabel("poliza.nombre");

        checkBoxControl1.setText("auditoria.activo");
        checkBoxControl1.setAttributeName("auditoria.activo");

        textControl1.setAttributeName("nombre");
        textControl1.setRequired(true);

        labelControl3.setLabel("poliza.fechaComienzo");

        labelControl4.setLabel("poliza.vigenciaDesde");

        labelControl5.setLabel("poliza.vigenciaHasta");

        dateControl1.setAttributeName("fechaComienzo");
        dateControl1.setRequired(true);

        dateControl2.setAttributeName("vigenciaDesde");
        dateControl2.setRequired(true);

        dateControl3.setAttributeName("vigenciaHasta");
        dateControl3.setRequired(true);

        labelControl6.setLabel("poliza.numero");

        textControl2.setAttributeName("numero");
        textControl2.setEnabledOnInsert(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numericControl1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelControl6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textControl2, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelControl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textControl1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelControl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateControl1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelControl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateControl2, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelControl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateControl3, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))
                    .addComponent(checkBoxControl1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {checkBoxControl1, labelControl1, labelControl2, labelControl3, labelControl4, labelControl5, labelControl6});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numericControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateControl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateControl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {checkBoxControl1, dateControl1, dateControl2, dateControl3, labelControl1, labelControl2, labelControl3, labelControl4, labelControl5, labelControl6, numericControl1, textControl1, textControl2});

        javax.swing.GroupLayout form1Layout = new javax.swing.GroupLayout(form1);
        form1.setLayout(form1Layout);
        form1Layout.setHorizontalGroup(
            form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        form1Layout.setVerticalGroup(
            form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(form1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(form1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(31, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Detalle de Poliza", jPanel4);

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Certificados"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insertButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(editButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(saveButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reloadButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exportButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navigatorBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filterButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filterButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(navigatorBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reloadButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        gridData.setDeleteButton(deleteButton1);
        gridData.setEditButton(editButton2);
        gridData.setExportButton(exportButton1);
        gridData.setFilterButton(filterButton1);
        gridData.setFunctionId("certificadosGrid");
        gridData.setInsertRowsOnTop(false);
        gridData.setNavBar(navigatorBar1);
        gridData.setReloadButton(reloadButton1);
        gridData.setSaveButton(saveButton2);
        gridData.setSearchAdditionalRows(true);
        gridData.setValueObjectClassName(Certificado.class.getName());

        decimalColumn1.setColumnName("id");
        decimalColumn1.setColumnRequired(false);
        decimalColumn1.setGrouping(false);
        decimalColumn1.setPreferredWidth(40);
        gridData.getColumnContainer().add(decimalColumn1);

        textColumn1.setColumnName("titular.persona.rif.rif");
        gridData.getColumnContainer().add(textColumn1);

        textColumn2.setColumnName("titular.persona.nombreLargo");
        gridData.getColumnContainer().add(textColumn2);

        checkBoxColumn1.setColumnName("auditoria.activo");
        checkBoxColumn1.setEditableOnEdit(true);
        gridData.getColumnContainer().add(checkBoxColumn1);

        textColumn4.setColumnFilterable(true);
        textColumn4.setColumnName("auditoria.usuarioInsert");
        textColumn4.setColumnRequired(false);
        textColumn4.setColumnSortable(true);
        gridData.getColumnContainer().add(textColumn4);

        dateTimeColumn1.setColumnFilterable(true);
        dateTimeColumn1.setColumnName("auditoria.fechaInsert");
        dateTimeColumn1.setColumnRequired(false);
        dateTimeColumn1.setColumnSortable(true);
        gridData.getColumnContainer().add(dateTimeColumn1);

        textColumn5.setColumnFilterable(true);
        textColumn5.setColumnName("auditoria.usuarioUpdate");
        textColumn5.setColumnRequired(false);
        textColumn5.setColumnSortable(true);
        gridData.getColumnContainer().add(textColumn5);

        dateTimeColumn2.setColumnFilterable(true);
        dateTimeColumn2.setColumnName("auditoria.fechaUpdate");
        dateTimeColumn2.setColumnRequired(false);
        dateTimeColumn2.setColumnSortable(true);
        gridData.getColumnContainer().add(dateTimeColumn2);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(gridData, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridData, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Certificados", jPanel12);

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
        decimalColumnObs.setGrouping(false);
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
                .addComponent(gridControlObs, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE))
        );
        jPanelObsLayout.setVerticalGroup(
            jPanelObsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelObsLayout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
            .addComponent(gridControlObs, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout observacionesLayout = new javax.swing.GroupLayout(observaciones);
        observaciones.setLayout(observacionesLayout);
        observacionesLayout.setHorizontalGroup(
            observacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
            .addGroup(observacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(observacionesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelObs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        observacionesLayout.setVerticalGroup(
            observacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
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
        decimalColumnNot.setGrouping(false);
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

        dateTimeColumn3.setColumnName("auditoria.fechaInsert");
        dateTimeColumn3.setColumnRequired(false);
        dateTimeColumn3.setColumnSortable(true);
        dateTimeColumn3.setSortVersus(org.openswing.swing.util.java.Consts.DESC_SORTED);
        gridControlNot.getColumnContainer().add(dateTimeColumn3);

        textColumnNot3.setColumnFilterable(true);
        textColumnNot3.setColumnName("auditoria.usuarioUpdate");
        textColumnNot3.setColumnRequired(false);
        textColumnNot3.setColumnSortable(true);
        gridControlNot.getColumnContainer().add(textColumnNot3);

        dateTimeColumn4.setColumnFilterable(true);
        dateTimeColumn4.setColumnName("auditoria.fechaUpdate");
        dateTimeColumn4.setColumnRequired(false);
        dateTimeColumn4.setColumnSortable(true);
        gridControlNot.getColumnContainer().add(dateTimeColumn4);

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
                .addComponent(gridControlNot, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE))
        );
        jPanelNotLayout.setVerticalGroup(
            jPanelNotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNotLayout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
            .addComponent(gridControlNot, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout notasTecnicasLayout = new javax.swing.GroupLayout(notasTecnicas);
        notasTecnicas.setLayout(notasTecnicasLayout);
        notasTecnicasLayout.setHorizontalGroup(
            notasTecnicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
            .addGroup(notasTecnicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(notasTecnicasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelNot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        notasTecnicasLayout.setVerticalGroup(
            notasTecnicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
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

        decimalColumnNot1.setColumnName("id");
        decimalColumnNot1.setColumnRequired(false);
        decimalColumnNot1.setGrouping(false);
        decimalColumnNot1.setPreferredWidth(40);
        gridControlDoc.getColumnContainer().add(decimalColumnNot1);

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
                .addComponent(gridControlDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDocLayout.setVerticalGroup(
            jPanelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDocLayout.createSequentialGroup()
                .addGroup(jPanelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gridControlDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout DocAnexosLayout = new javax.swing.GroupLayout(DocAnexos);
        DocAnexos.setLayout(DocAnexosLayout);
        DocAnexosLayout.setHorizontalGroup(
            DocAnexosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
            .addGroup(DocAnexosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DocAnexosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        DocAnexosLayout.setVerticalGroup(
            DocAnexosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
            .addGroup(DocAnexosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DocAnexosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("Documentos Anexos", DocAnexos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setVisiblePaneles(boolean visible) {
        jPanel3.setVisible(visible);
        jPanelDoc.setVisible(visible);
        jPanelNot.setVisible(visible);
        jPanelObs.setVisible(visible);

    }

    public BeanVO getBeanVO() {
        return (BeanVO) form1.getVOModel().getValueObject();
    }

    @Override
    public void inicializar(FormController formController, boolean addToMDIFrame) {
        initComponents();
        Class<?> esta = Poliza.class;
        //<editor-fold defaultstate="collapsed" desc="modulo de obs, not and doc">
        org.openswing.swing.table.columns.client.PictureCaptureColumn pcc =
                new org.openswing.swing.table.columns.client.PictureCaptureColumn();
        pcc.setColumnName("file");
        pcc.setEditableOnInsert(true);
        pcc.setEditableOnEdit(false);
        pcc.setFileNameAttributeName("fileName");
        pcc.setPreferredWidth(220);
        gridControlDoc.getColumnContainer().add(pcc);
        controllerDocumentosAnexosX = new DefaultDocumentosAnexosGridController(esta, gridControlDoc);
        buttonColumnDoc.addActionListener(controllerDocumentosAnexosX);
        gridControlDoc.setController(controllerDocumentosAnexosX);
        gridControlDoc.setGridDataLocator(controllerDocumentosAnexosX);

        com.jswitch.base.controlador.documentosAnexos.TipoDocumentoLookupController lookupDocumentoAnexo2 =
                new TipoDocumentoLookupController(com.jswitch.base.modelo.Dominios.Modulos.POLIZAS);
        lookupDocumentoAnexo2.addLookup2ParentLink("tipoDocumento");
        codLookupColumnDoc.setLookupController(lookupDocumentoAnexo2);

        controllerObservaciones =
                new DefaultGridInternalController(esta.getName(), "getObservaciones", gridControlObs);
        gridControlObs.setGridDataLocator(controllerObservaciones);
        gridControlObs.setController(controllerObservaciones);

        controllerNotasTecnicas =
                new DefaultGridInternalController(esta.getName(), "getNotasTecnicas", gridControlNot);
        gridControlNot.setGridDataLocator(controllerNotasTecnicas);
        gridControlNot.setController(controllerNotasTecnicas);
        //</editor-fold>


        controller =
                new CertificadosGridInternalController(Poliza.class.getName(), "getCertificados", gridData);
        gridData.setGridDataLocator(controller);
        gridData.setController(controller);

        form1.setCreateInnerVO(false);
        form1.setFormController(formController);
        insertButton1.addActionListener((ActionListener) formController);
        if (addToMDIFrame) {
            pack();
        } else {
            setBounds(0, 0, 0, 0);
        }

        MDIFrame.add(this);
    }

    @Override
    public void saveGridsData() {
        setVisiblePaneles(true);
    }

    @Override
    public void setOwnerVO(BeanVO beanVO) {
        controller.setBeanVO(beanVO);
        Long id = null;
        if (beanVO != null) {
            id = ((Poliza) beanVO).getId();

        }
        controllerDocumentosAnexosX.setBeanVO(beanVO, id);
        controllerObservaciones.setBeanVO(beanVO);
        controllerNotasTecnicas.setBeanVO(beanVO);

        reloadGridsData();
    }

    @Override
    public Form getMainPanel() {
        return form1;
    }

    @Override
    public void reloadGridsData() {
//        gridData.reloadData();
    }

    @Override
    public void clearGridsData() {
//        gridData.clearData();
    }

    @Override
    public void modeChanged(int currentMode) {
        if (currentMode == Consts.INSERT) {
            clearGridsData();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DocAnexos;
    private org.openswing.swing.table.columns.client.ButtonColumn buttonColumnDoc;
    private org.openswing.swing.table.columns.client.CheckBoxColumn checkBoxColumn1;
    private org.openswing.swing.client.CheckBoxControl checkBoxControl1;
    private org.openswing.swing.table.columns.client.CodLookupColumn codLookupColumnDoc;
    private org.openswing.swing.table.columns.client.DateColumn dateColumnDoc;
    private org.openswing.swing.client.DateControl dateControl1;
    private org.openswing.swing.client.DateControl dateControl2;
    private org.openswing.swing.client.DateControl dateControl3;
    private org.openswing.swing.table.columns.client.DateTimeColumn dateTimeColumn1;
    private org.openswing.swing.table.columns.client.DateTimeColumn dateTimeColumn2;
    private org.openswing.swing.table.columns.client.DateTimeColumn dateTimeColumn3;
    private org.openswing.swing.table.columns.client.DateTimeColumn dateTimeColumn4;
    private org.openswing.swing.table.columns.client.DateTimeColumn dateTimeColumnObs1;
    private org.openswing.swing.table.columns.client.DateTimeColumn dateTimeColumnObs2;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn1;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumnNot;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumnNot1;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumnObs;
    private org.openswing.swing.client.DeleteButton deleteButton1;
    private org.openswing.swing.client.DeleteButton deleteButtonDoc;
    private org.openswing.swing.client.DeleteButton deleteButtonObs;
    private org.openswing.swing.client.EditButton editButton1;
    private org.openswing.swing.client.EditButton editButton2;
    private org.openswing.swing.client.EditButton editButtonDoc;
    private org.openswing.swing.client.EditButton editButtonObs;
    private org.openswing.swing.client.ExportButton exportButton1;
    private org.openswing.swing.client.FilterButton filterButton1;
    private org.openswing.swing.client.FilterButton filterButtonDoc;
    private org.openswing.swing.form.client.Form form1;
    private org.openswing.swing.client.GridControl gridControlDoc;
    private org.openswing.swing.client.GridControl gridControlNot;
    private org.openswing.swing.client.GridControl gridControlObs;
    private org.openswing.swing.client.GridControl gridData;
    private org.openswing.swing.client.InsertButton insertButton1;
    private org.openswing.swing.client.InsertButton insertButtonDoc;
    private org.openswing.swing.client.InsertButton insertButtonNot;
    private org.openswing.swing.client.InsertButton insertButtonObs;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelDoc;
    private javax.swing.JPanel jPanelNot;
    private javax.swing.JPanel jPanelObs;
    private javax.swing.JTabbedPane jTabbedPane1;
    private org.openswing.swing.client.LabelControl labelControl1;
    private org.openswing.swing.client.LabelControl labelControl2;
    private org.openswing.swing.client.LabelControl labelControl3;
    private org.openswing.swing.client.LabelControl labelControl4;
    private org.openswing.swing.client.LabelControl labelControl5;
    private org.openswing.swing.client.LabelControl labelControl6;
    private org.openswing.swing.client.NavigatorBar navigatorBar1;
    private javax.swing.JPanel notasTecnicas;
    private org.openswing.swing.client.NumericControl numericControl1;
    private javax.swing.JPanel observaciones;
    private org.openswing.swing.client.ReloadButton reloadButton1;
    private org.openswing.swing.client.ReloadButton reloadButtonDoc;
    private org.openswing.swing.client.ReloadButton reloadButtonNot;
    private org.openswing.swing.client.ReloadButton reloadButtonObs;
    private org.openswing.swing.client.SaveButton saveButton1;
    private org.openswing.swing.client.SaveButton saveButton2;
    private org.openswing.swing.client.SaveButton saveButtonDoc;
    private org.openswing.swing.client.SaveButton saveButtonNot;
    private org.openswing.swing.client.SaveButton saveButtonObs;
    private org.openswing.swing.table.columns.client.TextColumn textColumn1;
    private org.openswing.swing.table.columns.client.TextColumn textColumn2;
    private org.openswing.swing.table.columns.client.TextColumn textColumn4;
    private org.openswing.swing.table.columns.client.TextColumn textColumn5;
    private org.openswing.swing.table.columns.client.TextColumn textColumnDoc;
    private org.openswing.swing.table.columns.client.TextColumn textColumnNot1;
    private org.openswing.swing.table.columns.client.TextColumn textColumnNot2;
    private org.openswing.swing.table.columns.client.TextColumn textColumnNot3;
    private org.openswing.swing.table.columns.client.TextColumn textColumnObs1;
    private org.openswing.swing.table.columns.client.TextColumn textColumnObs2;
    private org.openswing.swing.table.columns.client.TextColumn textColumnObs3;
    private org.openswing.swing.client.TextControl textControl1;
    private org.openswing.swing.client.TextControl textControl2;
    // End of variables declaration//GEN-END:variables

    public GridControl getGridData() {
        return gridData;
    }

    public Object getNuevoCertificicadoButton() {
        return insertButton1;
    }
}
