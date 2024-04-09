public class ResultadoEscolar {
    public static void main(String[] args) {
        
        int nota = 5;

        String resultado = nota >= 7 ? "Você está Aprovado" : nota > 5 && nota < 7 ? "Você está de Recuperação" : "Você está reprovado";

        System.out.println(resultado);

        

    }
}
