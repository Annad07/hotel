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
@Table(name = "tbl_usuarios")
@NamedQueries({
    @NamedQuery(name = "TblUsuarios.findAll", query = "SELECT t FROM TblUsuarios t")
    , @NamedQuery(name = "TblUsuarios.findById", query = "SELECT t FROM TblUsuarios t WHERE t.id = :id")
    , @NamedQuery(name = "TblUsuarios.findByDocumento", query = "SELECT t FROM TblUsuarios t WHERE t.documento = :documento")
    , @NamedQuery(name = "TblUsuarios.findByNombres", query = "SELECT t FROM TblUsuarios t WHERE t.nombres = :nombres")
    , @NamedQuery(name = "TblUsuarios.findByPrimerApellido", query = "SELECT t FROM TblUsuarios t WHERE t.primerApellido = :primerApellido")
    , @NamedQuery(name = "TblUsuarios.findBySegundoApellido", query = "SELECT t FROM TblUsuarios t WHERE t.segundoApellido = :segundoApellido")
    , @NamedQuery(name = "TblUsuarios.findByDireccion", query = "SELECT t FROM TblUsuarios t WHERE t.direccion = :direccion")
    , @NamedQuery(name = "TblUsuarios.findByTelefono", query = "SELECT t FROM TblUsuarios t WHERE t.telefono = :telefono")
    , @NamedQuery(name = "TblUsuarios.findByCorreo", query = "SELECT t FROM TblUsuarios t WHERE t.correo = :correo")
    , @NamedQuery(name = "TblUsuarios.findByClave", query = "SELECT t FROM TblUsuarios t WHERE t.clave = :clave")
    , @NamedQuery(name = "TblUsuarios.findByEstado", query = "SELECT t FROM TblUsuarios t WHERE t.estado = :estado")})
public class TblUsuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "documento")
    private long documento;
    @Basic(optional = false)
    @Column(name = "nombres")
    private String nombres;
    @Basic(optional = false)
    @Column(name = "primer_apellido")
    private String primerApellido;
    @Column(name = "segundo_apellido")
    private String segundoApellido;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @Column(name = "correo")
    private String correo;
    @Basic(optional = false)
    @Column(name = "clave")
    private String clave;
    @Column(name = "estado")
    private Short estado;
    @JoinColumn(name = "tbl_ciudades_codigo", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private TblCiudades tblCiudadesCodigo;
    @JoinColumn(name = "tbl_tipos_documento_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TblTiposDocumento tblTiposDocumentoId;
    @JoinColumn(name = "tbl_tipos_usuarios_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TblTiposUsuarios tblTiposUsuariosId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tblUsuariosId")
    private List<TblReservas> tblReservasList;

    public TblUsuarios() {
    }

    public TblUsuarios(Integer id) {
        this.id = id;
    }

    public TblUsuarios(Integer id, long documento, String nombres, String primerApellido, String correo, String clave) {
        this.id = id;
        this.documento = documento;
        this.nombres = nombres;
        this.primerApellido = primerApellido;
        this.correo = correo;
        this.clave = clave;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Short getEstado() {
        return estado;
    }

    public void setEstado(Short estado) {
        this.estado = estado;
    }

    public TblCiudades getTblCiudadesCodigo() {
        return tblCiudadesCodigo;
    }

    public void setTblCiudadesCodigo(TblCiudades tblCiudadesCodigo) {
        this.tblCiudadesCodigo = tblCiudadesCodigo;
    }

    public TblTiposDocumento getTblTiposDocumentoId() {
        return tblTiposDocumentoId;
    }

    public void setTblTiposDocumentoId(TblTiposDocumento tblTiposDocumentoId) {
        this.tblTiposDocumentoId = tblTiposDocumentoId;
    }

    public TblTiposUsuarios getTblTiposUsuariosId() {
        return tblTiposUsuariosId;
    }

    public void setTblTiposUsuariosId(TblTiposUsuarios tblTiposUsuariosId) {
        this.tblTiposUsuariosId = tblTiposUsuariosId;
    }

    public List<TblReservas> getTblReservasList() {
        return tblReservasList;
    }

    public void setTblReservasList(List<TblReservas> tblReservasList) {
        this.tblReservasList = tblReservasList;
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
        if (!(object instanceof TblUsuarios)) {
            return false;
        }
        TblUsuarios other = (TblUsuarios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sena.modelo.entidades.TblUsuarios[ id=" + id + " ]";
    }
    
}
