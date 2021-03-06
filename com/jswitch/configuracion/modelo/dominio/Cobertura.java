package com.jswitch.configuracion.modelo.dominio;

import com.jswitch.base.modelo.entidades.auditoria.Auditable;
import com.jswitch.base.modelo.entidades.auditoria.AuditoriaBasica;
import com.jswitch.base.modelo.util.bean.BeanVO;
import com.jswitch.base.modelo.util.ehts.BusinessKey;
import com.jswitch.base.modelo.util.ehts.Method;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "SINI_Cobertura")
public class Cobertura extends BeanVO implements Serializable, Auditable {

    /**
     *  PK autoincremtado
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    @BusinessKey(include = Method.TO_STRING)
    private Long id;
    /**
     * Nombre 
     */
    @Column
    @Size(min = 1, max = 120)
    @BusinessKey
    private String nombre;
    /**
     * Ramo al que pertenece
     */
    @ManyToOne
    @NotNull
    private Ramo ramo;
    /**
     * si es un Gasto clinico
     */
    @Column
    private Boolean gastosClinicos;
    /**
     * booleano que dice si es un gasto por honorarios medicos
     */
    @Column
    private Boolean honorariosMedicos;
    /**
     * booleano que dice si aplica no para la base imponible
     */
    @Column
    private Boolean baseImponible;
    /**
     * aplica IVA
     */
    @Column
    private Boolean iva;
    /**
     * aplica ISLR
     */
    @Column
    private Boolean islr;
    /**
     * version
     */
    @Version
    @Column
    private Integer optLock;
    /**
     * bitacora del sistema
     */
    @Embedded
    @BusinessKey
    private AuditoriaBasica auditoria;
    /**
     *
     */
    private transient String nombreCompleto;

    public Cobertura() {
        baseImponible=Boolean.FALSE;
        islr=Boolean.FALSE;
        iva=Boolean.FALSE;
        gastosClinicos=Boolean.FALSE;
        honorariosMedicos=Boolean.FALSE;
    }

    public Cobertura(String nombre, Ramo marca, AuditoriaBasica auditoria) {
        this.nombre = nombre;
        this.ramo = marca;
        this.auditoria = auditoria;
    }

    @Override
    public AuditoriaBasica getAuditoria() {
        return auditoria;
    }

    @Override
    public void setAuditoria(AuditoriaBasica auditoria) {
        this.auditoria = auditoria;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ramo getRamo() {
        return ramo;
    }

    public void setRamo(Ramo ramo) {
        this.ramo = ramo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getOptLock() {
        return optLock;
    }

    public void setOptLock(Integer optLock) {
        this.optLock = optLock;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreCompleto() {
        if (id != null) {
            return ramo.getNombre() + " - " + getNombre();
        } else {
            return nombreCompleto;
        }
    }

    /**
     * booleano que dice si aplica no para la base imponible
     * @return the baseImponible
     */
    public Boolean getBaseImponible() {
        return baseImponible;
    }

    /**
     * si es un Gasto clinico
     * @return the gastosClinicos
     */
    public Boolean getGastosClinicos() {
        return gastosClinicos;
    }

    /**
     * booleano que dice si es un gasto por honorarios medicos
     * @return the honorariosMedicos
     */
    public Boolean getHonorariosMedicos() {
        return honorariosMedicos;
    }

    /**
     * aplica ISLR
     * @return the islr
     */
    public Boolean getIslr() {
        return islr;
    }

    /**
     * aplica IVA
     * @return the iva
     */
    public Boolean getIva() {
        return iva;
    }

    /**
     * booleano que dice si aplica no para la base imponible
     * @param baseImponible the baseImponible to set
     */
    public void setBaseImponible(Boolean baseImponible) {
        this.baseImponible = baseImponible;
    }

    /**
     * si es un Gasto clinico
     * @param gastosClinicos the gastosClinicos to set
     */
    public void setGastosClinicos(Boolean gastosClinicos) {
        this.gastosClinicos = gastosClinicos;
    }

    /**
     * booleano que dice si es un gasto por honorarios medicos
     * @param honorariosMedicos the honorariosMedicos to set
     */
    public void setHonorariosMedicos(Boolean honorariosMedicos) {
        this.honorariosMedicos = honorariosMedicos;
    }

    /**
     * aplica ISLR
     * @param islr the islr to set
     */
    public void setIslr(Boolean islr) {
        this.islr = islr;
    }

    /**
     * aplica IVA
     * @param iva the iva to set
     */
    public void setIva(Boolean iva) {
        this.iva = iva;
    }
    
}
