package exercicio_atividade00;
import java.util.Scanner;

public class ListarProdutos {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		 
		
        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();
        
      
        String nomeProduto = "";
        if (codigo == 001) {
            nomeProduto = "PARAFUSO";
        } else if (codigo == 002) {
            nomeProduto = "Porca";
        } else if (codigo == 003) {
            nomeProduto = "Prego";
        } else if (codigo == 000) {
            nomeProduto = "Diversos";
        } else {
            System.out.println("Código de produto não encontrado.");
            System.exit(1); // Sai do programa com código de erro 1
        }

        // Exibe o nome do produto
        System.out.println("O nome do produto com código " + codigo + " é: " + nomeProduto);
    }
}
	
	


