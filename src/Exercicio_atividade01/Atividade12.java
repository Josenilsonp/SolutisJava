package Exercicio_atividade01;

import java.util.Scanner;

public class Atividade12 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int quilometrosDirigidosTotal = 0;
	        int litrosConsumidosTotal = 0;
	        
	        while (true) {
	            System.out.print("Digite os quilometros dirigidos (ou -1 para sair): ");
	            int quilometros = scanner.nextInt();
	            
	            if (quilometros == -1) {
	                break; // Sai do loop se o usuário digitar -1
	            }
	            
	            System.out.print("Digite os litros de gasolina consumidos: ");
	            int litrosConsumidos = scanner.nextInt();
	            
	            // Calcula o consumo em quilômetros por litro
	            double KmPorLitro = (double) quilometros / litrosConsumidos;
	            
	            System.out.printf("Consumo em km/l: %.2f%n", KmPorLitro);
	            
	            quilometrosDirigidosTotal += quilometros;
	            litrosConsumidosTotal += litrosConsumidos;
	            
	            System.out.println("Quilometragem combinada: " + quilometrosDirigidosTotal);
	            System.out.println("Litros totais consumidos: " + litrosConsumidosTotal);
	        }
	        System.out.println("Logout efetuado com sucesso ");
	        scanner.close();
	    }
}
