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
@Table(name = "tbl_tipos_documento")
@NamedQueries({
    @NamedQuery(name = "TblTiposDocumento.findAll", query = "SELECT t FROM TblTiposDocumento t")
    , @NamedQuery(name = "TblTiposDocumento.findById", query = "SELECT t FROM TblTiposDocumento t WHERE t.id = :id")
    , @NamedQuery(name = "TblTiposDocumento.findByNombre", query = "SELECT t FROM TblTiposDocumento t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TblTiposDocumento.findBySigla", query = "SELECT t FROM TblTiposDocumento t WHERE t.sigla = :sigla")})
public class TblTiposDocumento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "sigla")
    private String sigla;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tblTiposDocumentoId")
    private List<TblUsuarios> tblUsuariosList;

    public TblTiposDocumento() {
    }

    public TblTiposDocumento(Integer id) {
        this.id = id;
    }

    public TblTiposDocumento(Integer id, String nombre) {
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblTiposDocumento)) {
            return false;
        }
        TblTiposDocumento other = (TblTiposDocumento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.modelo.entidades.TblTiposDocumento[ id=" + id + " ]";
    }
    
}
