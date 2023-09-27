package Exercicio_atividade01;

public class Atividade6 {

	
 public static void main(String[] args) {
	        int produtoInt = 1;
	        float produtoFloat = 1.0f;

	        for (int numero = 15; numero <= 30; numero++) {
	            if (numero % 2 != 0) { // Verifica se o número é ímpar
	                produtoInt *= numero;
	                produtoFloat *= (float) numero; // Converte o número para float antes da multiplicação
	            }
	        }

	        System.out.println("Produto dos ímpares (int): " + produtoInt);
	        System.out.println("Produto dos ímpares (float): " + produtoFloat);
	    }
}
