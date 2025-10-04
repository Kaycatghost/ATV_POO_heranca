package Pessoa;

public class Main{
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Kay", 20, "M", 1234, "ADS");
        Funcionario funcionario = new Funcionario("Maria", 25, "F", "TI", "Sim");
        Professor professor = new Professor("João", 30, "M", "Programacao", 1000.0);
        System.out.println("Aluno: " + aluno.getnome() + " " + aluno.getidade() + " " + aluno.getsexo() + " " + aluno.getMatr() + " " + aluno.getCurso());
        System.out.println("Funcionario: " + funcionario.getnome() + " " + funcionario.getidade() + " " + funcionario.getsexo() + " " + funcionario.getSetor() + " " + funcionario.getTrabalhando());
        System.out.println("Professor: " + professor.getnome() + " " + professor.getidade() + " " + professor.getsexo() + " " + professor.getEspecialidade() + " " + professor.getSalario() );

}
}