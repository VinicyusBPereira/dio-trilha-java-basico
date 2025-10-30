
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero da sua conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o numero da agencia:");
        String agencia = scanner.nextLine();
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite seu saldo:");
        double saldo = scanner.nextDouble();
        scanner.nextLine();
        

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
        scanner.close();
    }
}
