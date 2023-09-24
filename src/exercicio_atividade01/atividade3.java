package exercicio_atividade01;
import java.util.Scanner;


public class atividade3 {
    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int limiteSuperior = scanner.nextInt();

        System.out.println("Números primos menores que " + limiteSuperior + ":");
        for (int i = 2; i < limiteSuperior; i++) {
            if (isPrimo(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
