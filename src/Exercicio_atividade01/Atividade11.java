package Exercicio_atividade01;

import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();
        
        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();
        
        // Ordena as palavras em ordem alfabética usando compareTo
        int comparacao = palavra1.compareTo(palavra2);
        String palavraMenor = (comparacao < 0) ? palavra1 : palavra2;
        String palavraMaior = (comparacao > 0) ? palavra1 : palavra2;
        
        System.out.println("Palavras em ordem alfabética: " + palavraMenor + ", " + palavraMaior);
        
        //Aqui compara o tamanho das palavras se palavra1 é maior que palavra 2 
        if (palavra1.length() > palavra2.length()) {
            System.out.println("A primeira palavra tem mais caracteres.");
            // Se palavra 1 é menor que palabra 2 
        } else if (palavra1.length() < palavra2.length()) {
            System.out.println("A segunda palavra tem mais caracteres.");
        } else {
            System.out.println("As duas palavras têm o mesmo número de caracteres.");
        }
        
        scanner.close();
    }
}
