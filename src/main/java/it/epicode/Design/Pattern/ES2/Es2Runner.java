package it.epicode.Design.Pattern.ES2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Es2Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("---------------------------Esercizio 2---------------------------");
        List<Autore> authors = new ArrayList<>();
        authors.add(new Autore("William Shakespeare"));
        authors.add(new Autore("Oscar Wilde"));

        Libro libro = new Libro(authors, 19.99);

        libro.addElemento(new Pagina(1));
        libro.addElemento(new Pagina(2));
        Sezione sezione1 = new Sezione(3);
        sezione1.addElemento(new Pagina(4));
        sezione1.addElemento(new Pagina(5));
        libro.addElemento(sezione1);
        Sezione sezione2 = new Sezione(6);
        sezione2.addElemento(new Pagina(7));
        sezione2.addElemento(new Pagina(8));
        libro.addElemento(sezione2);

        libro.stampa(1);
        libro.stampa(2);
        libro.stampa(4);
        libro.stampa(7);

        System.out.println("Numero totale di pagine: " + libro.getNumeroTotalePagine());

        System.out.println("Prezzo: " + libro.getPrezzo());
        System.out.println("Autori:");
        for (Autore author : libro.getAutori()) {
            System.out.println("- " + author.getNome());
        }

    }
}
