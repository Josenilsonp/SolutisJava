package exercicio_atividade01;

import java.util.Scanner;

public class ativdade5 {
	
    public static void main(String[] args) {
    	
    	
        Scanner scanner = new Scanner(System.in);

        String[] Semana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};       
        
        while (true) {
            System.out.print("Digite um número de 1 a 7 (ou 0 para sair): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("Programa encerrado.");
                break;
            } else if (numero >= 1 && numero <= 7) {
                String diaDaSemana = Semana[numero - 1];
                System.out.println("O dia da semana correspondente ao número " + numero + " é " + diaDaSemana);
            } else {
                System.out.println("Número fora do intervalo válido.");
            }
        }

            scanner.close();	
        	
        }      
   
}


