/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena.modelo.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Danna
 */
@Entity
@Table(name = "tbl_tipos_habitaciones")
@NamedQueries({
    @NamedQuery(name = "TblTiposHabitaciones.findAll", query = "SELECT t FROM TblTiposHabitaciones t")
    , @NamedQuery(name = "TblTiposHabitaciones.findById", query = "SELECT t FROM TblTiposHabitaciones t WHERE t.id = :id")
    , @NamedQuery(name = "TblTiposHabitaciones.findByNombre", query = "SELECT t FROM TblTiposHabitaciones t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TblTiposHabitaciones.findByDescripcion", query = "SELECT t FROM TblTiposHabitaciones t WHERE t.descripcion = :descripcion")})
public class TblTiposHabitaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tblTiposHabitacionesId")
    private List<TblHabitaciones> tblHabitacionesList;

    public TblTiposHabitaciones() {
    }

    public TblTiposHabitaciones(Integer id) {
        this.id = id;
    }

    public TblTiposHabitaciones(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<TblHabitaciones> getTblHabitacionesList() {
        return tblHabitacionesList;
    }

    public void setTblHabitacionesList(List<TblHabitaciones> tblHabitacionesList) {
        this.tblHabitacionesList = tblHabitacionesList;
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
        if (!(object instanceof TblTiposHabitaciones)) {
            return false;
        }
        TblTiposHabitaciones other = (TblTiposHabitaciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.modelo.entidades.TblTiposHabitaciones[ id=" + id + " ]";
    }
    
}
