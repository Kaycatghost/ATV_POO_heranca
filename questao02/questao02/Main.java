package questao02;

public class Main {
    
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Variedades", "Rua 1", "1234-5678", 1000.0, 500.0);
        
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Saldo: " + fornecedor.obterSaldo());
        
        fornecedor.setValorCredito(2000.0);
        fornecedor.setValorDivida(1000.0);
        System.out.println("Novo saldo: " + fornecedor.obterSaldo());
    }
    
}
