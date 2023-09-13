import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite seu Nome:");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite sua Agencia:");
        agencia = scanner.nextLine();

        System.out.println("Digite o número da sua conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite seu Saldo:");
        saldo = scanner.nextDouble();

        System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ". conta " + numero + " e seu saldo " + saldo + " já estão disponíveis para saque");

        scanner.close();
    }
}
