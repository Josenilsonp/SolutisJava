package exercicio_atividade00;

public class LancamentoDeDados {

	 public static void main(String[] args) {
	       
		 int Possibilidades = 0;
		 	//Primeiro dado usando um for contanto dado sendo menor igual a 6 dado++
	        for (int dado1 = 1; dado1 <= 6; dado1++) {
	        	//Segundo dado segue a mesma logica 
	            for (int dado2 = 1; dado2 <= 6; dado2++) {
	            	
	            	//No if temos a comparação dos valores se for == a 7 imprimi o resultado das 
	            	//probabilidades . 
	                if (dado1 + dado2 == 7) {
	                	
	                    System.out.println("Dado 1: " + dado1 + ", Dado 2: " + dado2);
	                    Possibilidades++;
	                }
	            }
	        }

	        System.out.println("Total de chances: " + Possibilidades);
	    }
}
