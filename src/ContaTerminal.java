import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nome_cliente;
        double saldo;

        System.out.print("Insira por gentileza o numero da sua conta: ");
        numero = scanner.nextInt();
        System.out.print("Insira por gentileza o numero da sua agencia: ");
        agencia = scanner.next();
        System.out.print("Insira por gentileza o seu nome completo: ");
        nome_cliente = scanner.next();
        scanner.nextLine();
        System.out.print("Insira por gentileza o saldo da sua conta: ");
        saldo = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("===================================================================================================================================================================================");
        System.out.println();
        System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " ja esta disponivel para saque.");
        System.out.println();
        System.out.println("===================================================================================================================================================================================");

        scanner.close();
    }
}
