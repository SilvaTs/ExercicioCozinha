package br.com.daniel.atividadecozinha;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class CozinhaItaliana extends Cozinha {

    public CozinhaItaliana() {
        this.tipo = "Cozinha Italiana";
        this.numeroDePratos = 10;
        this.tempoDoPreparo = 10;
        this.horarioAbertura = 13;
        this.horarioFechamento = 22;
        this.pratoPrincipal = "Espaguete";
        this.setIngredientes(new ArrayList<Ingrediente>());
        this.setFuncionario(new ArrayList<Funcionario>());

    }

    @Override
    public void PrepararOsPratos() {

        System.out.println("Preparando Seu Prato Italiano");
        System.out.println("");

        this.addIngrediente(new Ingrediente("Molho", "31/03/2021"));
        this.addIngrediente(new Ingrediente("Macarrão", "31/03/2021"));
        this.addIngrediente(new Ingrediente("Carne", "31/03/2021"));
    }

}
