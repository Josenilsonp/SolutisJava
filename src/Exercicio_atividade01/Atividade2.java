package Exercicio_atividade01;

public class Atividade2 {

	int valor1 ;
	int valor2 ;
	
	/*
	 *  Metodo para comparar os valores entre eles recebe dois valores como parametro 
	 *  valor1 e valor 2 de posse desses valores eu faço uma comparação com o if
	 *  se valor1 for maior que valor 2 retorna valor1 se não retorna valor 2 
	 *  assim sempre o maior valor vai ser retornado . 
	
	 * */
	public static int MaiorEntreEles (int valor1 , int valor2)  {
		if (valor1 > valor2) {
			return valor1;
		}else {
			return valor2;
		}
	}
	
	
	public static void main(String[] args) {
	int	resultado = MaiorEntreEles(22,4);
	System.out.println("O maior valor é: " + resultado);		
	}
	

}
