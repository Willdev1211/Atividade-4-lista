import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro valor booleano (true ou false): ");
        boolean valor1 = scanner.nextBoolean();


        System.out.print("Digite o segundo valor booleano (true ou false): ");
        boolean valor2 = scanner.nextBoolean();


        if (valor1 && valor2) {
            System.out.println("Ambos os valores são VERDADEIROS.");
        }

        else if (!valor1 && !valor2) {
            System.out.println("Ambos os valores são FALSOS.");
        }

        else {
            System.out.println("Os valores são mistos (um verdadeiro e um falso).");
        }


        scanner.close();
    }
}
