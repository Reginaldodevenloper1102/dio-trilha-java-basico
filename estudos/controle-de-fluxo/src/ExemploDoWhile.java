import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discand0...");

        do {
            //executandi repetidas vezes até alguem atender
            System.out.println("Telefone tocando");

        }while(tocando());

        System.out.println("Alô !!!");
    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu" + atendeu);
        //negando o ato de continuar tocanso 
        return ! atendeu;
    }
}
