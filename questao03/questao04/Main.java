package questao04;

public class Main {
    
    public static void main(String[] args) {
      Veiculo[] veiculos = new Veiculo[4];
      veiculos[0] = new Moto("honda", "CG 160", 160.0);
      veiculos[1] = new Carro("Toyota", "Corolla", 4);
      veiculos[2] = new Moto("yamaha", "FZ", 160.0);
      veiculos[3] = new Carro("Honda", "Civic", 4);
      
      for (int i = 0; i < veiculos.length; i++) {
          veiculos[i].exibirinfo();
    }
}
}
