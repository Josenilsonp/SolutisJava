package exercicio_atividade00;

public class LerDoisValores {

	static String Primeiro_Nome;
	static String Segundo_Nome;
	
	
	public static void main(String[] args) {

		Primeiro_Nome = "Josenilson";
		Segundo_Nome = " Pereira";
		
		//Ler dois valores para as vari�veis A e B
		System.out.println(Primeiro_Nome+Segundo_Nome);	
	
		///efetuar a troca dos valores de forma que a vari�vel A passe a possuir o valor da vari�vel B
	    
		
		//efetuar a troca dos valores de forma que a vari�vel A passe a possuir o valor da vari�vel B
		
		System.out.println(Primeiro_Nome);	
		Primeiro_Nome = Segundo_Nome;
		
		//e que a vari�vel B passe a possuir o valor da vari�vel A.
		System.out.println(Segundo_Nome);	
		Segundo_Nome = Primeiro_Nome;
		
		
	}

}
