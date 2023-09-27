package Exercicio_atividade01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade9 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite o valor do raio do círculo: ");
	        double raio = scanner.nextDouble();
	        
	        // Verifica se o raio é negativo e trata o caso
	        if (raio < 0) {
	            System.out.println("O raio não pode ser negativo.");
	        } else {
	            double area = calcularAreaCirculo(raio);
	            
	            // Arredonda o resultado para duas casas decimais
	            DecimalFormat formato = new DecimalFormat("#.##");
	            String areaFormatada = formato.format(area);
	            
	            System.out.println("A área do círculo é: " + areaFormatada);
	        }
	        
	        scanner.close();
	    }
	    
	    public static double calcularAreaCirculo(double raio) {
	        // Fórmula para calcular a área do círculo
	        return Math.PI * raio * raio;
	    }
}
