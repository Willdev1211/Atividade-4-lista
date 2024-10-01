import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();


        int resultado;


        if (numero > 0) {

            resultado = 2 * numero;
        } else {

            resultado = 3 * numero;
        }


        System.out.println("O resultado é: " + resultado);


        scanner.close();
    }
}
