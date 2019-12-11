package email;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.UnsupportedEncodingException;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import sena.modelo.entidades.*;
import sena.modelo.dao.*;

/**
 *
 * @author CristianHBarreto
 */
@ManagedBean
@SessionScoped
public class controladorMail {

    @EJB
    private TblUsuariosFacadeLocal usuariosFacadeLocal;
    private TblUsuarios usuarios;

    public controladorMail() {

    }
    
    @PostConstruct
    public void init(){
        usuarios = new TblUsuarios();
    }
    
    public TblUsuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(TblUsuarios usuarios) {
        this.usuarios = usuarios;
    }

    
    public void enviarCorreo() throws UnsupportedEncodingException {

    }

    public void recuperarContraseña() {

        TblUsuarios user = null;
        int pass;
        String letrasPass = "abcd";
        String nuevaPass = null;

        try {
            //Buscar usuario
         user = usuariosFacadeLocal.find(usuarios.getId());

            if (user != null) {
                
                int num1 = 97;
		int num2 = 122;
                char c = 0;
                
                for (int i=1; i<=10; i++){
                    
                pass =  (int)Math.floor(Math.random()*(num2 -num1)+num1);
                
                nuevaPass += (char)pass;
                
                
                
                }

                user.setClave(nuevaPass);
                
                usuariosFacadeLocal.edit(user);

                Correo CR = new Correo();
                CR.setAsunto("Cambio de clave");
                CR.setDestinatario(user.getCorreo());
                CR.setMensaje("Se ha realizado el cambio de su contraseña: " + user.getClave());

                CR.enviarCorreo();

                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso:", "Se ha cambiado su contraseña exitosamente"));
            } else {

                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error:", "el correo del usuario no existe"));
            }

        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "error", "error"));

            e.printStackTrace();
        }

    }
}
