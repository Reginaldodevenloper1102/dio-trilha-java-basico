import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploDeExcessao {
    public static void main(String[] args) {
       
        Number valor = Double.valueOf(0);
        try{

            valor =NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
            ;
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
