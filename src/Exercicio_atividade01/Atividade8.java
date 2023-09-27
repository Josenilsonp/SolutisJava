package Exercicio_atividade01;

public class Atividade8 {
	 public static boolean ehPalindromo(String palavra) {
	        // Remove espaços em branco e converte para letras minúsculas para tornar a verificação insensível a maiúsculas/minúsculas
	        palavra = palavra.replaceAll("\\s", "").toLowerCase();
	        
	        int comprimento = palavra.length();
	        
	        // Verifica se a palavra é um palíndromo comparando os caracteres da esquerda para a direita e da direita para a esquerda
	        for (int i = 0; i < comprimento / 2; i++) {
	            if (palavra.charAt(i) != palavra.charAt(comprimento - 1 - i)) {
	                return false; // Se os caracteres não coincidirem, não é um palíndromo
	            }
	        }
	        
	        return true; // Se passou pelo loop sem retornar false, é um palíndromo
	    }
	    
	    public static void main(String[] args) {
	        String palavra1 = "Ana";
	        String palavra2 = "arara";
	        String palavra3 = "osso";
	        String palavra4 = "java";
	        
	        if (ehPalindromo(palavra1)) {
	            System.out.println(palavra1 + " é um palíndromo.");
	        } else {
	            System.out.println(palavra1 + " não é um palíndromo.");
	        }
	        
	        if (ehPalindromo(palavra2)) {
	            System.out.println(palavra2 + " é um palíndromo.");
	        } else {
	            System.out.println(palavra2 + " não é um palíndromo.");
	        }
	        
	        if (ehPalindromo(palavra3)) {
	            System.out.println(palavra3 + " é um palíndromo.");
	        } else {
	            System.out.println(palavra3 + " não é um palíndromo.");
	        }
	        
	        if (ehPalindromo(palavra4)) {
	            System.out.println(palavra4 + " é um palíndromo.");
	        } else {
	            System.out.println(palavra4 + " não é um palíndromo.");
	        }
	    }
}
