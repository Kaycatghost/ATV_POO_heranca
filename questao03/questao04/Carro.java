package questao04;
public class Carro extends Veiculo{

    int quantidadedePortas;
    
    public Carro(String marca, String modelo, int quantidadedePortas) {
        super(marca, modelo);
        this.quantidadedePortas = quantidadedePortas;
    }
    
    public void exibirinfo() {
        super.exibirinfo();
        System.out.println("Quantidade de portas: " + quantidadedePortas);
    }
}
