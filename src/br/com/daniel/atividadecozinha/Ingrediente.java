
package br.com.daniel.atividadecozinha;

/**
 *
 * @author Daniel
 */
public class Ingrediente {
    
    public String nomeDosIngrediente;
    public String dataValidade;

    public Ingrediente(String nomeDosIngrediente, String dataValidade) {
        this.nomeDosIngrediente = nomeDosIngrediente;
        this.dataValidade = dataValidade;
    }

    public String getNomeDosIngrediente() {
        return nomeDosIngrediente;
    }

    public void setNomeDosIngrediente(String nomeDosIngrediente) {
        this.nomeDosIngrediente = nomeDosIngrediente;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
    
}
