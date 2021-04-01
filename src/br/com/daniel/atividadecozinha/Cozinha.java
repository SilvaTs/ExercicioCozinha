package br.com.daniel.atividadecozinha;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class Cozinha {

    public int numeroDePratos;
    public int numeroDeCozinheiros;
    public int tempoDoPreparo;
    public String tipo;
    public int horarioAbertura;
    public int horarioFechamento;
    public String pratoPrincipal;
    public List<Ingrediente> ingredientes;
    public List<Funcionario> funcionarios;

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

    public int getTempoDoPreparo() {
        return tempoDoPreparo;
    }

    public void setTempoDoPreparo(int tempoDoPreparo) {
        this.tempoDoPreparo = tempoDoPreparo;
    }

    public List<Funcionario> getFuncionarios() {
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

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void addIngrediente(Ingrediente ingrediente) {
        if (ingrediente != null && this.ingredientes != null) {
            this.ingredientes.add(ingrediente);

        }

    }

    public List<Funcionario> getFuncionario() {
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

    public void ListaOsIngredientesDosPrato() {
        if (this.ingredientes != null && this.ingredientes.size() > 0) {
            for (int i = 0; i < this.ingredientes.size(); i++) {
                System.out.println(this.ingredientes.get(i).getNomeDosIngrediente());
            }
        } else {
            System.out.println("O seu Prato não está preparado");
        }

    }

    public void PrepararOsPratos() {

        System.out.println("Aguarde Enquanto Estamos Preparando o Seu Prato");
    }

}
