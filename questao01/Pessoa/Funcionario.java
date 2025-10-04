package Pessoa;

public class Funcionario extends Pessoa {
    public String setor;
    public boolean trabalhando;
    public Funcionario(String nome, int idade, String sexo, String setor, String trabalhando) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = false;
    }
    
    public void mudarTrabalho(String trabalhando) {
        this.trabalhando = !this.trabalhando;
        System.out.println("Funcionário está trabalhando: " + getnome());
    }
    public String getSetor() {
        return this.setor;
    }
    public boolean getTrabalhando() {
        return this.trabalhando;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
