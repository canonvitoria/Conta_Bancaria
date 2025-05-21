import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeCliente = "Vitória Canon";
        String tipoConta = "Corrente";
        double saldo = 2200;

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.println("###########################");
        System.out.println("Dados iniciais do Cliente: ");
        System.out.println("\nNome: " + nomeCliente);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo Inicial: R$ " + df.format(saldo));
        System.out.println("###########################\n");

        int operacao = 0;

        while (operacao != 4) {
            System.out.println("\nOperações:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");

            System.out.print("Digite a opção desejada: ");
            operacao = scanner.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Seu saldo é de: R$ " + df.format(saldo));
                    break;

                case 2:
                    System.out.print("Digite o valor que deseja receber: R$ ");
                    double receber = scanner.nextDouble();

                    if (receber <= 0) {
                        System.out.println("Valor inválido.");
                    } else {
                        saldo += receber;
                        System.out.println("Novo saldo: R$ " + df.format(saldo));
                    }
                    break;

                case 3:
                    System.out.print("Digite o valor que deseja transferir: R$ ");
                    double transferir = scanner.nextDouble();

                    if (transferir <= 0) {
                        System.out.println("Valor inválido.");
                    } else if (transferir > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= transferir;
                        System.out.println("Transferência realizada.");
                        System.out.println("Novo saldo: R$ " + df.format(saldo));
                    }
                    break;

                case 4:
                    System.out.println("Você saiu! Até mais.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
