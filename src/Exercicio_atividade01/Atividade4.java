package Exercicio_atividade01;

import java.util.Scanner;

public class Atividade4 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Recebe o valor digitado na variavel milhas 
        System.out.print("Digite a distância em milhas: ");
        double milhas = scanner.nextDouble();

        // Faz a conversão de milhas para quilômetros ou seja o valor digitado na variavel minhas * 1.609
        double quilometros = milhas * 1.609;

        System.out.println(milhas + " milhas é equivalente a " + quilometros + " quilômetros.");

        scanner.close();
    }
}
