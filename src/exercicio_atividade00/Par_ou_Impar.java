package exercicio_atividade00;

public class Par_ou_Impar {
	
	    private int numero;

	    //Construtor recebe o atributo numero 
	    public Par_ou_Impar(int numero) {
	        this.numero = numero;
	    }

	    //Verifica se o numero informado no atributo e par ou impar  usando o operador % (m�dulo) 
	    //Se for divisor por 2 e par e vai dar 0 se n�o � impar
	    public void verifica_numero() {
	        if (numero % 2 == 0) {
	            System.out.println(numero + " Esse numero é par.");
	        } else {
	            System.out.println(numero + " Esse numero é Impar.");
	        }
	    }

	    	public static void main(String[] args) {
	        
	        int numero = 4; // Atribuindo um valor ao parametro numero 
	        //Instanciando um objeto do tipo Par ou Umpar 
	        Par_ou_Impar verificador = new Par_ou_Impar(numero);
	        //Chamando o metodo da classe e faz a verifica��o . 
	        verificador.verifica_numero();
	      
	        
	    }

}
