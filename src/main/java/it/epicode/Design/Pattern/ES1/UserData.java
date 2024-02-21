package it.epicode.Design.Pattern.ES1;

public class UserData implements it.epicode.Design.Pattern.ES1.DataSource {
    private String nomeCompleto;
    private int eta;

    @Override
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    @Override
    public int getEta() {
        return eta;
    }

    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }
}