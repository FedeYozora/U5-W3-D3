package it.epicode.Design.Pattern.ES2;

public class Pagina implements Elemento {
    private int numeroPagina;

    public Pagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }

    @Override
    public void stampa() {
        System.out.println("Stampo pagina " + numeroPagina);
    }

    @Override
    public boolean includePagine(int numeroPagina) {
        return this.numeroPagina == numeroPagina;
    }
}
