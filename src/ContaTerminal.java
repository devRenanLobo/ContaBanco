import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      scanner.useLocale(Locale.US);

      User user =  new User();
      
      System.out.println("** Bem Vindo ao sistema de banco do Renan **");
      System.out.println("");
      System.out.print("Digite o seu nome: ");
      user.nomeCliente = scanner.nextLine();
      
      System.out.print("Digite a sua agência: ");
      user.agencia = scanner.nextLine();

      System.out.print("Digite o número da agencia: ");
      user.numero = scanner.nextInt();

      System.out.print("Digite o seu saldo: ");
      user.saldo = scanner.nextDouble();

      scanner.close();

      System.out.println("");
      System.out.println("Olá " + user.nomeCliente + 
      ", obrigado por criar uma conta em nosso banco, sua agência é "
      + user.agencia + ", conta " + user.numero + " e seu saldo "+ user.saldo + 
      " já está disponível para saque.");

    }
}
