import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nome;
        double saldo;

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta!");
        numero = input.nextInt();
        input.nextLine();

        System.out.println("Por favor, digite o número da agência!");
        agencia = input.nextLine();

        System.out.println("Por favor, digite o nome do cliente!");
        nome = input.nextLine();

        System.out.println("Por favor, digite o saldo da conta!");
        saldo = input.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}