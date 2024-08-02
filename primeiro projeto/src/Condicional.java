public class Condicional {
    public static void main(String[] args) {
        int anodelancamento = 2022 ;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoplano = "normal";

        if (anodelancamento >= 2022) {
            System.out.println("Estão curtindo");
        } else {
            System.out.println("Não estão curtindo");
        }

        if (incluidoNoPlano || tipoplano.equals("plus")){
            System.out.println("Liberado");
        } else{
            System.out.println("Voce agora tem que me pagar um milhao de reais");
        }

    }
}
