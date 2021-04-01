
package br.com.daniel.atividadecozinha;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class CozinhaMineira extends Cozinha{
    
      public CozinhaMineira() {
        this.tipo = "Cozinha Mineira";
        this.numeroDePratos = 10;
        this.tempoDoPreparo = 10;
        this.horarioAbertura = 10;
        this.horarioFechamento = 21;
        this.pratoPrincipal = "Feijoada";
        this.setIngredientes(new ArrayList<Ingrediente>());
        this.setFuncionario(new ArrayList<Funcionario>());

    }

    @Override
    public void PrepararOsPratos() {

        System.out.println("Preparando Seu Prato Mineiro");
        System.out.println("");
        this.addIngrediente(new Ingrediente("Feijão", "31/03/2021"));
        this.addIngrediente(new Ingrediente("Farinha", "31/03/2021"));
        this.addIngrediente(new Ingrediente("Arroz", "31/03/2021"));
        this.addIngrediente(new Ingrediente("Carne de Porco", "31/03/2021"));
        this.addIngrediente(new Ingrediente("Linguiça", "31/03/2021"));
    }
    
}
