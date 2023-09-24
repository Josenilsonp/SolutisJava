package exercicio_atividade01;

import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância em milhas: ");
        double milhas = scanner.nextDouble();

        // Fórmula de conversão de milhas para quilômetros
        double quilometros = milhas * 1.609;

        System.out.println(milhas + " milhas é equivalente a " + quilometros + " quilômetros.");

        scanner.close();
    }
}
