package Exercicio_atividade01;

public class Atividade10 {

	public static void main(String[] args) {
		
		//Essa string é uma sequência de caracteres ou símbolos
        String cadeia = "Esta é uma cadeia de caracteres de exemplo";
        
        // As variaveis abaixo recebem os valores e como parametro a cadeia de caracteres 
        
        int vogais = contarVogais(cadeia);
        int espacos = contarEspacos(cadeia);
        int consoantes = contarConsoantes(cadeia);
        
        System.out.println("Quantidade de vogais: " + vogais);
        System.out.println("Quantidade de espaços em branco: " + espacos);
        System.out.println("Quantidade de consoantes: " + consoantes);
    }
    
	//retorna o valor da string original convertido para minúsculo usando o toLowerCase()
    public static int contarVogais(String cadeia) {
        int contador = 0;
        cadeia = cadeia.toLowerCase(); 
     
        
   // Converte a cadeia para letras minúsculas para tornar a verificação insensível a maiúsculas/minúsculas
        
        for (int i = 0; i < cadeia.length(); i++) {
            char caractere = cadeia.charAt(i);
            if (isVogal(caractere)) {
                contador++;
            }
        }
        
        return contador;
    }
    //Conta a quantidade de espaços 
    public static int contarEspacos(String cadeia) {
        int contador = 0;
        
        for (int i = 0; i < cadeia.length(); i++) {
            if (cadeia.charAt(i) == ' ') {
                contador++;
            }
        }
        
        return contador;
    }
    //Conta a quantidade de Consoantes  
    public static int contarConsoantes(String cadeia) {
        int contador = 0;
        cadeia = cadeia.toLowerCase(); // Converte a cadeia para letras minúsculas para tornar a verificação insensível a maiúsculas/minúsculas
        
        for (int i = 0; i < cadeia.length(); i++) {
            char caractere = cadeia.charAt(i);
            if (isConsoante(caractere)) {
                contador++;
            }
        }
        
        return contador;
    }

    public static boolean isVogal(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static boolean isConsoante(char c) {
        return Character.isLetter(c) && !isVogal(c);
    }
    
}
