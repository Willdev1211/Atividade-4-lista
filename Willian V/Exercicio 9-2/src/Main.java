import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a sua altura em metros (exemplo: 1.75): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o seu sexo (M para masculino, F para feminino): ");
        char sexo = scanner.next().toUpperCase().charAt(0);


        double pesoIdeal;


        if (sexo == 'M') {

            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F') {

            pesoIdeal = (62.1 * altura) - 44.7;
        } else {

            System.out.println("Sexo inválido. Utilize 'M' para masculino ou 'F' para feminino.");
            scanner.close();
            return;
        }


        System.out.println("O peso ideal é: " + pesoIdeal + " kg");


        scanner.close();
    }
}
