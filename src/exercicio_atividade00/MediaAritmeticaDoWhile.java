package exercicio_atividade00;

//importado a biblioteca java.util.scanner para a entrada dos dados 
import java.util.Scanner;

public class MediaAritmeticaDoWhile {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int contador = 0;
	        double soma = 0.0;

	        System.out.println("Digite 50 números:");

	        do {
	            if (scanner.hasNextDouble()) {
	                double numero = scanner.nextDouble();
	                soma += numero;
	                contador++;
	            } else {
	                System.out.println("Por favor, digite um número válido.");
	                scanner.next(); // Descarta o valor inválido
	            }
	        } while (contador < 50);

	        scanner.close();

	        if (contador > 0) {
	            double media = soma / contador;
	            System.out.println("Média aritmética dos números: " + media);
	        } else {
	            System.out.println("Nenhum número válido foi digitado.");
	        }
	    }
}
