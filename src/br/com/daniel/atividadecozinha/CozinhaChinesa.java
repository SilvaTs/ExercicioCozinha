
package br.com.daniel.atividadecozinha;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class CozinhaChinesa extends Cozinha {
    
     public CozinhaChinesa() {
        this.tipo = "Cozinha Chinesa";
        this.numeroDePratos = 10;
        this.tempoDoPreparo = 10;
        this.horarioAbertura = 10;
        this.horarioFechamento = 21;
        this.pratoPrincipal = "Yakissoba";
        this.setIngredientes(new ArrayList<Ingrediente>());
        this.setFuncionario(new ArrayList<Funcionario>());

    }

    @Override
    public void PrepararOsPratos() {

        System.out.println("Preparando Seu Prato Chinês");
        System.out.println("");

        this.addIngrediente(new Ingrediente("Champignon", "31/03/2021"));
        this.addIngrediente(new Ingrediente("Brócolis", "31/03/2021"));
        this.addIngrediente(new Ingrediente("Macarrão", "31/03/2021"));
        this.addIngrediente(new Ingrediente("Carne", "31/03/2021"));
    }
    
}
