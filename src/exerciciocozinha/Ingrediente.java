package exerciciocozinha;

import java.time.LocalDate;

/**
 *
 * @author Daniel
 */
public class Ingrediente {

    private String nomeIngrediente;
    private LocalDate dataValidade;

    public Ingrediente(String nomeIngrediente, LocalDate dataValidade) {
        this.nomeIngrediente = nomeIngrediente;
        this.dataValidade = dataValidade;
    }

    public String getnomeDosIngrediente() {
        return nomeIngrediente;
    }

    public LocalDate getDataDaValidade() {
        return dataValidade;
    }

}
