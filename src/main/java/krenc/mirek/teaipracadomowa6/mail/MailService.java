package krenc.mirek.teaipracadomowa6.mail;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.time.LocalDateTime;
import java.util.Properties;

@Service
public class MailService {

    private JavaMailSender javaMailSender;

    public MailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

//    @EventListener(ApplicationReadyEvent.class)
    public void sendEmailTest(String emailAddres, String title, String message)
    {
        LocalDateTime localDateBefore = LocalDateTime.now();
        System.out.println("Start sending email " + localDateBefore);
        createAndSendEmailTLS(emailAddres, title, message);
        LocalDateTime localDateAfter = LocalDateTime.now();
        System.out.println("After sending email " + localDateAfter);
    }

    private void createAndSendEmailTLS(String emailAddres, String title, String message) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(emailAddres);
        simpleMailMessage.setSubject(title);
        simpleMailMessage.setFrom("kremir@prokonto.pl");
        simpleMailMessage.setText(message);

        javaMailSender.send(simpleMailMessage);
    }

}





