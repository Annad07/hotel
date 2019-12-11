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
@Table(name = "tbl_ciudades")
@NamedQueries({
    @NamedQuery(name = "TblCiudades.findAll", query = "SELECT t FROM TblCiudades t")
    , @NamedQuery(name = "TblCiudades.findByCodigo", query = "SELECT t FROM TblCiudades t WHERE t.codigo = :codigo")
    , @NamedQuery(name = "TblCiudades.findByNombre", query = "SELECT t FROM TblCiudades t WHERE t.nombre = :nombre")})
public class TblCiudades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tblCiudadesCodigo")
    private List<TblSedesHotel> tblSedesHotelList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tblCiudadesCodigo")
    private List<TblUsuarios> tblUsuariosList;

    public TblCiudades() {
    }

    public TblCiudades(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<TblSedesHotel> getTblSedesHotelList() {
        return tblSedesHotelList;
    }

    public void setTblSedesHotelList(List<TblSedesHotel> tblSedesHotelList) {
        this.tblSedesHotelList = tblSedesHotelList;
    }

    public List<TblUsuarios> getTblUsuariosList() {
        return tblUsuariosList;
    }

    public void setTblUsuariosList(List<TblUsuarios> tblUsuariosList) {
        this.tblUsuariosList = tblUsuariosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCiudades)) {
            return false;
        }
        TblCiudades other = (TblCiudades) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.modelo.entidades.TblCiudades[ codigo=" + codigo + " ]";
    }
    
}
