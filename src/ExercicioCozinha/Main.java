package ExercicioCozinha;

/**
 *
 * @author Daniel
 */
class Main {

    public static void main(String[] args) {

        cozinhaMineira();

        System.out.println("");
        System.out.println("-------------------------------------------------------");
        System.out.println("");

        cozinhaItaliana();
        
        System.out.println("");
        System.out.println("-------------------------------------------------------");
        System.out.println("");

       cozinhaChineza(); 

    }

    private static void cozinhaMineira() {

        Cozinha cozinhaMineira = new CozinhaMineira();
        System.out.println(cozinhaMineira.getTipo());

        cozinhaMineira.addFuncionario(new Funcionario("Daniel Silva", "Cozinheiro 3"));
        cozinhaMineira.addFuncionario(new Funcionario("Antonio", "Cozinheiro 2"));
        cozinhaMineira.addFuncionario(new Funcionario("Luiza", "Saladeira"));
        cozinhaMineira.addFuncionario(new Funcionario("Pedro", "Auxiliar de Cozinha"));

        cozinhaMineira.PrepararOsPratos();
        cozinhaMineira.ListaDosIngredientesDosPrato();
    }

    private static void cozinhaItaliana() {

        Cozinha cozinhaItaliana = new CozinhaItaliana();
        System.out.println(cozinhaItaliana.getTipo());

        cozinhaItaliana.addFuncionario(new Funcionario("Paulo", "Cozinheiro 2"));
        cozinhaItaliana.addFuncionario(new Funcionario("Tiago", "Auxiliar de Cozinha"));

        cozinhaItaliana.PrepararOsPratos();
        cozinhaItaliana.ListaDosIngredientesDosPrato();
    }
    
     private static void cozinhaChineza() {

        Cozinha cozinhaChinesa = new CozinhaChinesa();
        cozinhaChinesa.addFuncionario(new Funcionario("Daniela", "Cozinheira 3"));
        cozinhaChinesa.addFuncionario(new Funcionario("Danielo", "Cozinheiro 2"));
        cozinhaChinesa.addFuncionario(new Funcionario("Diego", "Cozinheiro 1"));
        System.out.println(cozinhaChinesa.getTipo());
        cozinhaChinesa.PrepararOsPratos();
        cozinhaChinesa.ListaDosIngredientesDosPrato();
    }
}
