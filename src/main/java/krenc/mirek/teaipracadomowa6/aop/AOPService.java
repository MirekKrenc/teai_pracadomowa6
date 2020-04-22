package krenc.mirek.teaipracadomowa6.aop;

import krenc.mirek.teaipracadomowa6.mail.MailService;
import krenc.mirek.teaipracadomowa6.model.Movie;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class AOPService {

    private MailService mailService;

    public AOPService(MailService mailService) {
        this.mailService = mailService;
    }

    @Around("@annotation(NewRecordAdded)")
    public void sendInfo(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();

        joinPoint.proceed();
        mailService.sendEmail("silmido67@go2.pl", "Dodano film do bazy", args[0].toString());

    }

}
