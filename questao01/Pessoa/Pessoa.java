package Pessoa;
public class Pessoa {
    public String nome;
    public int idade;
    public String sexo;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void fazerAniv() {
        this.idade++;
        System.out.println("Feliz aniversário!");
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getnome() {
        return this.nome;
    }
    public void setidade(int idade) {
        this.idade = idade;
    }
    public int getidade() {
        return this.idade;
    }
    public void setsexo(String sexo) {
        this.sexo = sexo;
    }
    public String getsexo() {
        return this.sexo;
    }
}