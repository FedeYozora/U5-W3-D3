package it.epicode.Design.Pattern.ES1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class Info {
    @Setter
    private String nome;
    @Setter
    private String cognome;
    private LocalDate dataDiNascita;

    public void DataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }
}