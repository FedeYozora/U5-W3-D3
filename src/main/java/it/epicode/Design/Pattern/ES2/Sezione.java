package it.epicode.Design.Pattern.ES2;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements Elemento {
    private List<Elemento> elementi;
    private int numeroPaginaIniziale;

    public Sezione(int numeroPaginaIniziale) {
        this.elementi = new ArrayList<>();
        this.numeroPaginaIniziale = numeroPaginaIniziale;
    }

    public void addElemento(Elemento elemento) {
        this.elementi.add(elemento);
    }

    @Override
    public int getNumeroPagine() {
        int numeroPagine = 0;
        for (Elemento elemento : elementi) {
            numeroPagine += elemento.getNumeroPagine();
        }
        return numeroPagine;
    }

    @Override
    public void stampa() {
        System.out.println("Stampo sezione che inizia dalla pagina " + numeroPaginaIniziale);
        for (Elemento elemento : elementi) {
            elemento.stampa();
        }
    }

    @Override
    public boolean includePagine(int numeroPagina) {
        for (Elemento elemento : elementi) {
            if (elemento.includePagine(numeroPagina)) {
                return true;
            }
        }
        return false;
    }
}
