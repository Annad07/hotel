package sena.Controllers;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import sena.modelo.dao.*;
import sena.modelo.entidades.*;

@Named
@RequestScoped
public class huespedController {

    @EJB
    private TblUsuariosFacadeLocal tblUsuariosFacadeLocal;

    private TblUsuarios tblUsuarios;
    private TblTiposDocumento tblTiposDocumento;
    private TblTiposUsuarios tblTiposUsuarios;
    private TblCiudades tblCiudades;

    List<TblUsuarios> listaUsuarios;

    @PostConstruct
    public void init() {
        tblUsuarios = new TblUsuarios();
        tblTiposDocumento = new TblTiposDocumento();
        tblCiudades = new TblCiudades();
        tblTiposUsuarios = new TblTiposUsuarios();
        listaUsuarios = tblUsuariosFacadeLocal.findAll();
    }

    public TblUsuarios getTblUsuarios() {
        return tblUsuarios;
    }

    public void setTblUsuarios(TblUsuarios tblUsuarios) {
        this.tblUsuarios = tblUsuarios;
    }

    public List<TblUsuarios> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<TblUsuarios> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public TblTiposDocumento getTblTiposDocumento() {
        return tblTiposDocumento;
    }

    public void setTblTiposDocumento(TblTiposDocumento tblTiposDocumento) {
        this.tblTiposDocumento = tblTiposDocumento;
    }

    public TblTiposUsuarios getTblTiposUsuarios() {
        return tblTiposUsuarios;
    }

    public void setTblTiposUsuarios(TblTiposUsuarios tblTiposUsuarios) {
        this.tblTiposUsuarios = tblTiposUsuarios;
    }

    public TblCiudades getTblCiudades() {
        return tblCiudades;
    }

    public void setTblCiudades(TblCiudades tblCiudades) {
        this.tblCiudades = tblCiudades;
    }

    public String consultarUsuario(TblUsuarios usuar) {
        try {
            tblUsuarios = tblUsuariosFacadeLocal.find(usuar.getId());
            tblTiposDocumento = tblUsuarios.getTblTiposDocumentoId();
            tblCiudades = tblUsuarios.getTblCiudadesCodigo();
            tblTiposUsuarios = tblUsuarios.getTblTiposUsuariosId();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "modificar-huesped";
    }

    public void editaUsurio() {
        try {
            tblUsuarios.setTblTiposDocumentoId(tblTiposDocumento);
            tblUsuarios.setTblCiudadesCodigo(tblCiudades);
            tblUsuarios.setTblTiposUsuariosId(tblTiposUsuarios);
            tblUsuariosFacadeLocal.edit(tblUsuarios);
            
        } catch (Exception e) {
            e.printStackTrace();
            FacesContext.getCurrentInstance().addMessage(null, 
                    new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error"," "));
        }
    }

    public List<TblUsuarios> listarClientes() {
        List<TblUsuarios> listCli = null;
        try {
            listCli = tblUsuariosFacadeLocal.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listCli;
    }
}
