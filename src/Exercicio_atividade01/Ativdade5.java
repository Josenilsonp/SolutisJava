package Exercicio_atividade01;

import java.util.Scanner;

public class Ativdade5 {
	
    public static void main(String[] args) {
    	
    	//armazena a entrada padrão do sistema
        Scanner scanner = new Scanner(System.in);

        //Armazena os dias da semana em um arrey
        
        String[] Semana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};       
        
        //adicionado um loop para sempre solicitar um numero e deixa o sistema continuo ate que digite o valor 0 
        
        while (true) {
        	
            System.out.print("Digite um número de 1 a 7 (ou 0 para sair): ");
            int numero = scanner.nextInt();
            //int numero recebe o valor digitado 
            
            //Se numero for igual a zero break para o programa
            if (numero == 0) {
                System.out.println("Programa encerrado.");
                break;
            
            /*  Se não faz a comparação numero maior que igual a 1 e com o operador logico && numero tem que ser menor ou igual a 7 
             *  isso significa que ambos os lados devem ser true para que a expressão seja true .
             */ 
                
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


