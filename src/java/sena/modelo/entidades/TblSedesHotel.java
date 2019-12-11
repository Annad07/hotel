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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tbl_sedes_hotel")
@NamedQueries({
    @NamedQuery(name = "TblSedesHotel.findAll", query = "SELECT t FROM TblSedesHotel t")
    , @NamedQuery(name = "TblSedesHotel.findById", query = "SELECT t FROM TblSedesHotel t WHERE t.id = :id")
    , @NamedQuery(name = "TblSedesHotel.findByBarrio", query = "SELECT t FROM TblSedesHotel t WHERE t.barrio = :barrio")
    , @NamedQuery(name = "TblSedesHotel.findByDireccion", query = "SELECT t FROM TblSedesHotel t WHERE t.direccion = :direccion")
    , @NamedQuery(name = "TblSedesHotel.findByTelefonos", query = "SELECT t FROM TblSedesHotel t WHERE t.telefonos = :telefonos")})
public class TblSedesHotel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 60)
    @Column(name = "barrio")
    private String barrio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "telefonos")
    private String telefonos;
    @JoinColumn(name = "tbl_ciudades_codigo", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private TblCiudades tblCiudadesCodigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tblSedesHotelId")
    private List<TblHabitaciones> tblHabitacionesList;

    public TblSedesHotel() {
    }

    public TblSedesHotel(Integer id) {
        this.id = id;
    }

    public TblSedesHotel(Integer id, String direccion, String telefonos) {
        this.id = id;
        this.direccion = direccion;
        this.telefonos = telefonos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public TblCiudades getTblCiudadesCodigo() {
        return tblCiudadesCodigo;
    }

    public void setTblCiudadesCodigo(TblCiudades tblCiudadesCodigo) {
        this.tblCiudadesCodigo = tblCiudadesCodigo;
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
        if (!(object instanceof TblSedesHotel)) {
            return false;
        }
        TblSedesHotel other = (TblSedesHotel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.modelo.entidades.TblSedesHotel[ id=" + id + " ]";
    }
    
}
