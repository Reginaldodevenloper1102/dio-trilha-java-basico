import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO:Conhecer e importar a classe Scanner 
        
        //Exibir as mensagens para nosso usuários 

        //Exibir a mensagem conta criada 

        double saldo = 50.00;

        

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá,Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Olá,Digite sua agência: ");
        int agencia = scanner.nextInt();
        
        System.out.println("Olá,Digite sua Conta: ");
        String conta = scanner.next();

        System.out.printf("Seja bem vido ao nosso banco " + nome, "temos os prazer de atendelo");
        System.out.printf("Sua agencia é: " + agencia,"temos os prazer de atendelo");
        System.out.printf("Sua conta é: " + conta,"temos os prazer de atendelo,obrigado por abrir uma conta em nosso");

        
    }
}
