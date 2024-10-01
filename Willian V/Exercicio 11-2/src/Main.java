import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o preço normal do produto: R$ ");
        double precoNormal = scanner.nextDouble();


        System.out.print("Digite o código da condição de pagamento (1, 2, 3 ou 4): ");
        int codigoCondicao = scanner.nextInt();


        double valorPago;

        switch (codigoCondicao) {
            case 1:

                valorPago = precoNormal * 0.90;
                break;
            case 2:

                valorPago = precoNormal * 0.85;
                break;
            case 3:

                valorPago = precoNormal;
                break;
            case 4:

                valorPago = precoNormal * 1.10;
                break;
            default:

                System.out.println("Código de condição de pagamento inválido.");
                scanner.close();
                return;
        }


        System.out.printf("O valor a ser pago é: R$ %.2f\n", valorPago);


        scanner.close();
    }
}
