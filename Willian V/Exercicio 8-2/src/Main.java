import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro valor inteiro: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo valor inteiro: ");
        int b = scanner.nextInt();

        System.out.print("Digite o terceiro valor inteiro: ");
        int c = scanner.nextInt();


        int maior, meio, menor;


        if (a >= b && a >= c) {
            maior = a;
            if (b >= c) {
                meio = b;
                menor = c;
            } else {
                meio = c;
                menor = b;
            }
        } else if (b >= a && b >= c) {
            maior = b;
            if (a >= c) {
                meio = a;
                menor = c;
            } else {
                meio = c;
                menor = a;
            }
        } else {
            maior = c;
            if (a >= b) {
                meio = a;
                menor = b;
            } else {
                meio = b;
                menor = a;
            }
        }


        System.out.println("Os valores em ordem decrescente são: " + maior + ", " + meio + ", " + menor);


        scanner.close();
    }
}
