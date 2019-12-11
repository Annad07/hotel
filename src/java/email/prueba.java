package email;


import java.io.UnsupportedEncodingException;

/**
 *
 * @author CristianHBarreto
 */
public class prueba {

    public static void main(String[] args) throws UnsupportedEncodingException {
        Mailer.send("sebastan4098@gmail.com", "Correo", "Envio un correo de prueba");
    }

}
