import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class AboutMe {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try{

        //Criando o código Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite seu idade");
        int idade = scanner.nextInt();

        System.out.println("Digite seu altura");
        Double altura = scanner.nextDouble();

        System.out.println("Olá me chamo" + nome.toUpperCase() + sobrenome+ " ");
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("MINHA ALTURA É " + altura + "cm");
        }
        catch (InputMismatchException e){
            System.out.println("O campo de idade e altura precisa ser numérico");
        }


  } 
    
}
