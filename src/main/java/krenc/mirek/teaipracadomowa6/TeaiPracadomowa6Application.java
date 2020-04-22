package krenc.mirek.teaipracadomowa6;

import krenc.mirek.teaipracadomowa6.aop.NewRecordAdded;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class TeaiPracadomowa6Application {

    public static void main(String[] args) {
        SpringApplication.run(TeaiPracadomowa6Application.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    @NewRecordAdded
    public void testAOPmethod()
    {
        System.out.println("Metoda symuljaca dodanie nowego rekordu");
    }
}
