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
@Table(name = "tbl_habitaciones")
@NamedQueries({
    @NamedQuery(name = "TblHabitaciones.findAll", query = "SELECT t FROM TblHabitaciones t")
    , @NamedQuery(name = "TblHabitaciones.findById", query = "SELECT t FROM TblHabitaciones t WHERE t.id = :id")
    , @NamedQuery(name = "TblHabitaciones.findByNumero", query = "SELECT t FROM TblHabitaciones t WHERE t.numero = :numero")
    , @NamedQuery(name = "TblHabitaciones.findByBanioPrivado", query = "SELECT t FROM TblHabitaciones t WHERE t.banioPrivado = :banioPrivado")
    , @NamedQuery(name = "TblHabitaciones.findByTelefono", query = "SELECT t FROM TblHabitaciones t WHERE t.telefono = :telefono")
    , @NamedQuery(name = "TblHabitaciones.findByCalefaccion", query = "SELECT t FROM TblHabitaciones t WHERE t.calefaccion = :calefaccion")
    , @NamedQuery(name = "TblHabitaciones.findByEstado", query = "SELECT t FROM TblHabitaciones t WHERE t.estado = :estado")})
public class TblHabitaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "numero")
    private int numero;
    @Column(name = "banio_privado")
    private Boolean banioPrivado;
    @Column(name = "telefono")
    private Boolean telefono;
    @Column(name = "calefaccion")
    private Boolean calefaccion;
    @Size(max = 15)
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tblHabitacionesId")
    private List<TblReservas> tblReservasList;
    @JoinColumn(name = "tbl_sedes_hotel_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TblSedesHotel tblSedesHotelId;
    @JoinColumn(name = "tbl_tipos_habitaciones_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TblTiposHabitaciones tblTiposHabitacionesId;

    public TblHabitaciones() {
    }

    public TblHabitaciones(Integer id) {
        this.id = id;
    }

    public TblHabitaciones(Integer id, int numero) {
        this.id = id;
        this.numero = numero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Boolean getBanioPrivado() {
        return banioPrivado;
    }

    public void setBanioPrivado(Boolean banioPrivado) {
        this.banioPrivado = banioPrivado;
    }

    public Boolean getTelefono() {
        return telefono;
    }

    public void setTelefono(Boolean telefono) {
        this.telefono = telefono;
    }

    public Boolean getCalefaccion() {
        return calefaccion;
    }

    public void setCalefaccion(Boolean calefaccion) {
        this.calefaccion = calefaccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<TblReservas> getTblReservasList() {
        return tblReservasList;
    }

    public void setTblReservasList(List<TblReservas> tblReservasList) {
        this.tblReservasList = tblReservasList;
    }

    public TblSedesHotel getTblSedesHotelId() {
        return tblSedesHotelId;
    }

    public void setTblSedesHotelId(TblSedesHotel tblSedesHotelId) {
        this.tblSedesHotelId = tblSedesHotelId;
    }

    public TblTiposHabitaciones getTblTiposHabitacionesId() {
        return tblTiposHabitacionesId;
    }

    public void setTblTiposHabitacionesId(TblTiposHabitaciones tblTiposHabitacionesId) {
        this.tblTiposHabitacionesId = tblTiposHabitacionesId;
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
        if (!(object instanceof TblHabitaciones)) {
            return false;
        }
        TblHabitaciones other = (TblHabitaciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.modelo.entidades.TblHabitaciones[ id=" + id + " ]";
    }
    
}
