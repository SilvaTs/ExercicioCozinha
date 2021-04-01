package br.com.daniel.atividadecozinha;

/**
 *
 * @author Daniel
 */
public class Funcionario {

    public String nome;
    public String atividade;

    public Funcionario(String nome, String atividade) {
        this.atividade = atividade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

}
