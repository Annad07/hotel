/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena.modelo.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "tbl_reservas")
@NamedQueries({
    @NamedQuery(name = "TblReservas.findAll", query = "SELECT t FROM TblReservas t")
    , @NamedQuery(name = "TblReservas.findById", query = "SELECT t FROM TblReservas t WHERE t.id = :id")
    , @NamedQuery(name = "TblReservas.findByFechaIngreso", query = "SELECT t FROM TblReservas t WHERE t.fechaIngreso = :fechaIngreso")
    , @NamedQuery(name = "TblReservas.findByFechaSalida", query = "SELECT t FROM TblReservas t WHERE t.fechaSalida = :fechaSalida")
    , @NamedQuery(name = "TblReservas.findByEstado", query = "SELECT t FROM TblReservas t WHERE t.estado = :estado")})
public class TblReservas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_ingreso")
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;
    @Column(name = "fecha_salida")
    @Temporal(TemporalType.DATE)
    private Date fechaSalida;
    @Size(max = 15)
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "tbl_habitaciones_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TblHabitaciones tblHabitacionesId;
    @JoinColumn(name = "tbl_usuarios_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TblUsuarios tblUsuariosId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tblReservasId")
    private List<TblObservaciones> tblObservacionesList;

    public TblReservas() {
    }

    public TblReservas(Integer id) {
        this.id = id;
    }

    public TblReservas(Integer id, Date fechaIngreso) {
        this.id = id;
        this.fechaIngreso = fechaIngreso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public TblHabitaciones getTblHabitacionesId() {
        return tblHabitacionesId;
    }

    public void setTblHabitacionesId(TblHabitaciones tblHabitacionesId) {
        this.tblHabitacionesId = tblHabitacionesId;
    }

    public TblUsuarios getTblUsuariosId() {
        return tblUsuariosId;
    }

    public void setTblUsuariosId(TblUsuarios tblUsuariosId) {
        this.tblUsuariosId = tblUsuariosId;
    }

    public List<TblObservaciones> getTblObservacionesList() {
        return tblObservacionesList;
    }

    public void setTblObservacionesList(List<TblObservaciones> tblObservacionesList) {
        this.tblObservacionesList = tblObservacionesList;
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
        if (!(object instanceof TblReservas)) {
            return false;
        }
        TblReservas other = (TblReservas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.modelo.entidades.TblReservas[ id=" + id + " ]";
    }
    
}
