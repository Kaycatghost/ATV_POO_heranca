package Pessoa;

public class Professor extends Pessoa {
    public String especialidade;
    private double salario;
    public Professor(String nome, int idade, String sexo, String especialidade, double salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }
    
    public void receberAumento(double aumento) {
        this.salario += aumento;
        System.out.println("Novo salário: " + this.salario);
    }
    public String getEspecialidade() {
        return this.especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
