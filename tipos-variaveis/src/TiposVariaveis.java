public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //double salarioMinimo = 2.500;

        //short numeroCurto = 1;
        //int numeroNormal = numeroCurto;
        //short numeroCurto2 = (short) numeroNormal;

        // variaveis-valor armazenado em memoria 
        //vs 
        //constantes-valor armazenado em memoria que não pode ser mudados

        int numero = 5;
        numero = 10;
        System.out.println(numero);
        
        //Para declarar a constante, deve ter a variavel em CAPS e o "final"
        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);
    }
}
