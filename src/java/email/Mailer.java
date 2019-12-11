package email;


import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class Mailer {

    public static void send(String para, String asunto, String mensaje) throws UnsupportedEncodingException {

        final String user = "juli.mora.5667@gmail.com";//cambiará en consecuencia al servidor utilizado
        final String pass = "MORA1001192129mora"; // El correo debe permitir enviar correos no seguros https://myaccount.google.com/lesssecureapps

//1st paso | Obtener el objeto de sesión
        Properties props = new Properties();
        props.setProperty("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.port", "587");
        props.setProperty("mail.smtp.starttls.required", "false");
        props.setProperty("mail.smtp.auth", "true");
        props.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com");

        Session session;
        session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, pass);
            }
        });

//2nd paso | Armar el mensaje
        try {
            //Para adjuntos
            BodyPart adjunto = new MimeBodyPart();
            adjunto.setDataHandler(new DataHandler(new FileDataSource("C:/Servidores/mysql-init.txt")));
            adjunto.setFileName("mysql-init.txt");

            BodyPart texto = new MimeBodyPart();
            texto.setContent(mensaje, "text/html");
            MimeMultipart multiparte = new MimeMultipart();
            multiparte.addBodyPart(texto);
            //Adjunto
            multiparte.addBodyPart(adjunto);

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user, "Veterinaria las Mascotas de Juliana"));
            InternetAddress[] destinatarios = {
                new InternetAddress(para),
                new InternetAddress("otrocorreo@outlook.com")
            };

            message.setRecipients(Message.RecipientType.TO, destinatarios);
            message.setSubject(asunto);
            message.setContent(multiparte, "text/html; charset=utf-8");

//3rd paso| Enviar el mensaje
            Transport.send(message);

            System.out.println("Mensaje Enviado");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

    }
}
