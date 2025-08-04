
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o número da conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Digite a agência: ");
        sc.nextLine();
        String agencia = sc.nextLine();
        System.out.print("Valor a ser depositado: ");
        double saldo = sc.nextDouble();

        System.out.println();
        System.out.print("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta "+ numeroConta + " e seu saldo R$" + saldo + " já está disponivel para saque.");
        


    }
}
