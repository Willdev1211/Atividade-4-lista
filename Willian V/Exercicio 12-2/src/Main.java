import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o número de identificação do aluno: ");
        int numeroIdentificacao = scanner.nextInt();


        System.out.print("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();


        System.out.print("Digite a média dos exercícios: ");
        double mediaExercicios = scanner.nextDouble();


        double mediaAproveitamento = (nota1 + (nota2 * 2) + (nota3 * 3) + mediaExercicios) / 7;


        char conceito;
        String status;

        if (mediaAproveitamento >= 90) {
            conceito = 'A';
            status = "Aprovado";
        } else if (mediaAproveitamento >= 75) {
            conceito = 'B';
            status = "Aprovado";
        } else if (mediaAproveitamento >= 60) {
            conceito = 'C';
            status = "Aprovado";
        } else if (mediaAproveitamento >= 40) {
            conceito = 'D';
            status = "Reprovado";
        } else {
            conceito = 'E';
            status = "Reprovado";
        }


        System.out.println("Número de Identificação: " + numeroIdentificacao);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Média dos Exercícios: " + mediaExercicios);
        System.out.printf("Média de Aproveitamento: %.2f\n", mediaAproveitamento);
        System.out.println("Conceito: " + conceito);
        System.out.println("Status: " + status);


        scanner.close();
    }
}
