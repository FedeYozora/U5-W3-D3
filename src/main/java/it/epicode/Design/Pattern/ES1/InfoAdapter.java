package it.epicode.Design.Pattern.ES1;

import java.time.LocalDate;
import java.time.Period;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(info.getDataDiNascita(), now);
        return period.getYears();
    }
}
