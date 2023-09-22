package exercicio_atividade00;

//importado a biblioteca java.util.scanner para a entrada dos dados 
import java.util.Scanner;

public class MediaAritimetica {

	 public static void main(String[] args) {
	      //Cria um opbejto Scanner recebendo como parametro sistem.in como entrada 
		 Scanner scanner = new Scanner(System.in);

	        int contador = 0;
	        double soma = 0.0;

	        //Solicita a entrada dos dados no console 
	        System.out.println("Digite 50 números:");

	        /*Após a entrada dos dados o while fica no loop recebendo os valores ate que seja menor que 
	         * 50 Quando contador chegar nos 50 numeros 
	        o if faz a verificação com o metodo hasNextDouble da classe scanner verifica se é um numero de 
	        entrada double valido . 
	        */
	        while (contador < 50) {
	            if (scanner.hasNextDouble()) {
	                double numero = scanner.nextDouble();
	                soma += numero;
	                contador++;
	            } else {
	                System.out.println("Por favor, digite um número válido.");
	                scanner.next(); // Descarta o valor inválido
	            }
	        }
	        //Fecha o while 
	        scanner.close();
	        // se contador for maior que 0 faça a media 
	        if (contador > 0) {
	            double media = soma / contador;
	            //imprimi o resultado 
	            System.out.println("Média aritmética dos números: " + media);
	        } else {
	            System.out.println("Nenhum número válido foi digitado.");
	        }
	    }
}
