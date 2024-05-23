import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Agora informe a agência: ");
        String agencia = sc.nextLine();
        System.out.print("Por favor, digite o número da agência: ");
        int numeroAgencia = sc.nextInt();
        System.out.print("Saldo da conta: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
}
