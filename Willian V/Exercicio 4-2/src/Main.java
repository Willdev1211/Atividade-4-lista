import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        int C;

        if (A == B) {

            C = A + B;
        } else {

            C = A * B;
        }

        System.out.println("O valor de C é: " + C);

        scanner.close();
    }
}
