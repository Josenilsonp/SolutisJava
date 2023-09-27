package Exercicio_atividade01;
import java.util.Scanner;

public class Atividade3 {
	
	/* Metodo primo recebi um parametro inteiro e verifica se ele é menor ou igual a 1 
	 * No for faz uma varredura utilizando o math
	 * A função Math.sqrt() retorna a raiz quadrada de um número 
	 *
	 */
	
    public static boolean Primo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        
        /*
         * adicionado um loop com o while para sempre solicitar um novo valor de entrada para dar continuidade ao programa 
         * ao digitar 00 break sai da repetição 
         * 
         */
        while(true) {
        	 System.out.print("Digite um número inteiro: (Ou digite 00 para sair) ");
             int limiteSuperior = scanner.nextInt();	
        	
             if(limiteSuperior == 0 ) {
            	 break; 
             }
             
             System.out.println("Números primos menores que " + limiteSuperior + ":");
             for (int i = 2; i < limiteSuperior; i++) {
                 if (Primo(i)) {
                     System.out.print(i + " ");
                 }
             }

            
         }
        System.out.println("Logout efetuado com sucesso ");
        scanner.close(); 
        }
        
   

        
}
