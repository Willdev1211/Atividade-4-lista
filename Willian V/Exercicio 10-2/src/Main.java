import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura em metros (exemplo: 1.75): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        String condicao;
        if (imc < 18.5) {
            condicao = "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 25) {
            condicao = "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            condicao = "Acima do peso";
        } else {
            condicao = "Obeso";
        }


        System.out.printf("Seu IMC é: %.2f\n", imc);
        System.out.println("Condição: " + condicao);


        scanner.close();
    }
}
