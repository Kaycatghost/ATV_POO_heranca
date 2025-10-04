package questao04;
public class Moto extends Veiculo{
    double cilindrada;
    
    public Moto(String marca, String modelo, double cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }
    
    public void exibirinfo() {
        super.exibirinfo();
        System.out.println("Cilindrada: " + cilindrada);
    }
    
}
