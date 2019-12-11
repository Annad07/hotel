/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena.Controllers;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import sena.modelo.dao.*;
import sena.modelo.entidades.*;

/**
 *
 * @author Danna
 */
@Named
@RequestScoped
public class loginController {

    @EJB
    private TblUsuariosFacadeLocal tbusuariofacadeLocal;
    private TblUsuarios tbusuario;

    @PostConstruct

    public void init() {
        tbusuario = new TblUsuarios();
    }

    public TblUsuarios getTbusuario() {
        return tbusuario;
    }

    public void setTbusuario(TblUsuarios tbusuario) {
        this.tbusuario = tbusuario;
    }

    public String inicioSession() {
        TblUsuarios u = null;
        String url = null;

        try {
            u = tbusuariofacadeLocal.login(tbusuario);
            if (u != null) {
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", u);
                String rol = u.getTblTiposUsuariosId().getNombre();

                switch (rol) {
                    case "Administrador":
                        url = "app/admi/index_admi?faces-redirect=true";
                        break;
                    case "Empleado":
                        url = "app/emple/index-emple?faces-redirect=true";

                        break;
                    case "Huesped":
                        url = "app/hues/index-hues?faces-redirect=true";

                        break;
                    default:
                        throw new AssertionError();
                }
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Aviso", "Usuario o contraseñas incorrectas"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error", "Se ha generado un error"));
        }

        return url;
    }

    public void verificarSesion() {
        try {
            TblUsuarios u = (TblUsuarios) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("user");
            if (u == null) {
                FacesContext.getCurrentInstance().getExternalContext().redirect("../../../permisos.xhtml");
            }
        } catch (Exception e) {
        }
    }

    public String cerrarSession() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();

        return "/index.xhtml?faces-redirect=true";
    }

}
