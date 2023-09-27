package Exercicio_atividade01;

public class Atividade7 {

	 public static void main(String[] args) {
	        System.out.println("Resultados da divisão por 2 dos múltiplos de 3 entre 1 e 100:");
	        
	        for (int numero = 1; numero <= 100; numero++) {
	            if (numero % 3 == 0) { // Verifica se é múltiplo de 3
	                int resultadoInt = numero / 2;
	                double resultadoDouble = (double) numero / 2.0;
	                
	                System.out.println("Múltiplo de 3: " + numero);
	                System.out.println("Resultado (int): " + resultadoInt);
	                System.out.println("Resultado (double): " + resultadoDouble);
	            }
	        }
	    }
}
