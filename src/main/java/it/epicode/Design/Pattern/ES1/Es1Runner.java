package it.epicode.Design.Pattern.ES1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Es1Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("---------------------------Esercizio 1---------------------------");

        Info info = new Info("Federico", "Bonfiglio", LocalDate.of(2000, 7, 15));

        UserData userData = new UserData();
        InfoAdapter adapter = new InfoAdapter(info);
        userData.getData(adapter);

        System.out.println("Nome completo: " + userData.getNomeCompleto());
        System.out.println("Età: " + userData.getEta());

    }
}
