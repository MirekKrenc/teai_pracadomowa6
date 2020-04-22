package krenc.mirek.teaipracadomowa6.aop;

import krenc.mirek.teaipracadomowa6.mail.MailService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class AOPService {

    private MailService mailService;

    public AOPService(MailService mailService) {
        this.mailService = mailService;
    }

    @After("@annotation(NewRecordAdded)")
    public void sendInfo()
    {
        mailService.sendEmailTest("silmido67@go2.pl", "testujemy1", "treśc maila");
    }

}
