/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena.modelo.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Danna
 */
@Entity
@Table(name = "tbl_observaciones")
@NamedQueries({
    @NamedQuery(name = "TblObservaciones.findAll", query = "SELECT t FROM TblObservaciones t")
    , @NamedQuery(name = "TblObservaciones.findById", query = "SELECT t FROM TblObservaciones t WHERE t.id = :id")
    , @NamedQuery(name = "TblObservaciones.findByTipo", query = "SELECT t FROM TblObservaciones t WHERE t.tipo = :tipo")
    , @NamedQuery(name = "TblObservaciones.findByFecha", query = "SELECT t FROM TblObservaciones t WHERE t.fecha = :fecha")})
public class TblObservaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "tipo")
    private short tipo;
    @Basic(optional = false)
    @Lob
    @Column(name = "observaci\u00f3n")
    private String observación;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @JoinColumn(name = "tbl_reservas_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TblReservas tblReservasId;

    public TblObservaciones() {
    }

    public TblObservaciones(Integer id) {
        this.id = id;
    }

    public TblObservaciones(Integer id, short tipo, String observación, Date fecha) {
        this.id = id;
        this.tipo = tipo;
        this.observación = observación;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public short getTipo() {
        return tipo;
    }

    public void setTipo(short tipo) {
        this.tipo = tipo;
    }

    public String getObservación() {
        return observación;
    }

    public void setObservación(String observación) {
        this.observación = observación;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public TblReservas getTblReservasId() {
        return tblReservasId;
    }

    public void setTblReservasId(TblReservas tblReservasId) {
        this.tblReservasId = tblReservasId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblObservaciones)) {
            return false;
        }
        TblObservaciones other = (TblObservaciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.modelo.entidades.TblObservaciones[ id=" + id + " ]";
    }
    
}
