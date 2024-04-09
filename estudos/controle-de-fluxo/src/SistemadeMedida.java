public class SistemadeMedida {
    public static void main(String[] args) {

    String sigla = "K";
    switch (sigla) {
        case "P":{
            System.out.println("IMPRIMA PEQUENO");
        }
    
        case "M":{
            System.out.println("IMPRIMA TAMANHO MEDIO");
        }

        break;
        

        case "G":{
            System.out.println("IMPRIMA TAMANHO GRANDE");
        }
        
            
            break;
        default:{
            System.out.println("Tamanho indefinido");
        
            break;
        }
    }
    }
        
    
}
