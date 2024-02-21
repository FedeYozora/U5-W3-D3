package it.epicode.Design.Pattern.ES2;

public interface Elemento {
    int getNumeroPagine();

    void stampa();

    boolean includePagine(int numeroPagina);
}
