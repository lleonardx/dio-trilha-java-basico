public class OperadorTernario {
    public static void main(String[] args) {
        //operador ternario
        int a,b;
        a=5;
        b=6;

        //maneiras de expressar o operador ternario
        String resultado = "";
        if(a==b){
            resultado = "verdadeiro";
        }else{
            resultado = "falso";
        }
        System.out.println(resultado);
        
        
        String resultado1 = a==b ? "verdeiro" : "falso";
        System.out.println(resultado1);
    }
    
}
