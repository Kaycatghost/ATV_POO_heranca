package questao04;



public class Veiculo {
    String marca;
    String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirinfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
    
}
