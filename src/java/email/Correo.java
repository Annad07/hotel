/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package email;

import java.io.UnsupportedEncodingException;

/**
 *
 * @author sebas
 */
public class Correo {
    
    public Correo() {
    }

    String asunto="";
    String destinatario="";
    String mensaje="";
    

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public void enviarCorreo() throws UnsupportedEncodingException{
       

            
            Mailer.send(destinatario,asunto,mensaje);
    }
}
