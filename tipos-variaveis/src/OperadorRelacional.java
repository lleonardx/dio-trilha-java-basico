public class OperadorRelacional {
    public static void main(String[] args) {

        String nomeUm = "LEONARDO";
        String nomeDois = new String("LEONARDO");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        if (numero1 == numero2){//true
            System.out.println("nossa condição é verdadeira.");
        }

        //Exemplo 1 - igual
        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual ao numeroDois? :" + simNao);
        //Exemplo 2 - diferente
        boolean simNao1 = numero1 != numero2;
        System.out.println("numeroUm é diferente ao numeroDois? :" + simNao1);
        //Exemplo 3 - maior
        boolean simNao2 = numero1 != numero2;
        System.out.println("numeroUm é maior ao numeroDois? :" + simNao2);


    }
}
