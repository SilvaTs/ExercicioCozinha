package exerciciocozinha;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Cozinha {

    private int numeroDePratos;
    private int numeroDeCozinheiros;
    private int tempoDePreparo;
    private String tipo;
    private int horarioAbertura;
    private int horarioFechamento;
    private String pratoPrincipal;
    private ArrayList<Ingrediente> ingredientes;
    private ArrayList<Funcionario> funcionarios;

    public int getNumeroDePratos() {
        return numeroDePratos;
    }

    public void setNumeroDePratos(int numeroDePratos) {
        this.numeroDePratos = numeroDePratos;
    }

    public int getNumeroDeCozinheiros() {
        return numeroDeCozinheiros;
    }

    public void setNumeroDeCozinheiros(int numeroDeCozinheiros) {
        this.numeroDeCozinheiros = numeroDeCozinheiros;
    }

    public int getTempoDePreparo() {
        return tempoDePreparo;
    }

    public void setTempoDePreparo(int tempoDePreparo) {
        this.tempoDePreparo = tempoDePreparo;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
  
    
    
    public int getHorarioAbertura() {
        return horarioAbertura;
    }

    public void setHorarioAbertura(int horarioAbertura) {
        this.horarioAbertura = horarioAbertura;
    }

    public int getHorarioFechamento() {
        return horarioFechamento;
    }

    public void setHorarioFechamento(int horarioFechamento) {
        this.horarioFechamento = horarioFechamento;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPratoPrincipal() {
        return pratoPrincipal;
    }

    public void setPratoPrincipal(String pratoPrincipal) {
        this.pratoPrincipal = pratoPrincipal;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void addIngrediente(Ingrediente ingrediente) {
        if (ingrediente != null && this.ingredientes != null) {
            this.ingredientes.add(ingrediente);

        }

    }

    public ArrayList<Funcionario> getFuncionario() {
        return funcionarios;
    }

    public void setFuncionario(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void addFuncionario(Funcionario funcionario) {
        if (funcionarios != null && this.funcionarios != null) {
            this.funcionarios.add(funcionario);

        }

    }
   
    public void ListaOsIngredientesDoPrato() {
        if (this.ingredientes != null && this.ingredientes.size() > 0) {
            for (int i = 0; i < this.ingredientes.size(); i++) {
                System.out.println(this.ingredientes.get(i).getnomeDosIngrediente());
            }
        } else {
            System.out.println("O Prato não está preparado");
        }

    }
   
}
