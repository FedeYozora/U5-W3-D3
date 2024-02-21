package it.epicode.Design.Pattern.ES2;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Libro {
    private List<Autore> autori;
    private double prezzo;
    private int numeroTotalePagine;
    private List<Elemento> elementi;

    public Libro(List<Autore> autori, double prezzo) {
        this.autori = autori;
        this.prezzo = prezzo;
        this.elementi = new ArrayList<>();
        this.numeroTotalePagine = 0;
    }

    public void addElemento(Elemento elemento) {
        this.elementi.add(elemento);
        this.numeroTotalePagine += elemento.getNumeroPagine();
    }

    public void stampa(int numeroPagina) {
        for (Elemento elemento : elementi) {
            if (elemento.includePagine(numeroPagina)) {
                elemento.stampa();
            }
        }
    }
}
