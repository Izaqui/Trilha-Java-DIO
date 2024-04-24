import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero da Agencia: ");
        String agencia = scanner.nextLine();

        System.out.print("Numero da Conta: ");
        int numero = scanner.nextInt();

        System.out.print("Nome do Cliente: ");
        String cliente = scanner.nextLine();
        scanner.nextLine();

        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
        ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
