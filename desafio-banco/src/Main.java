public class Main {
    public static void main(String[] args) {
        IConta cc = new ContaCorrente();
        cc.depositar(100);
        cc.imprimirExtrato();

        IConta cp = new ContaPoupanca();
        cp.imprimirExtrato();

        //Transferindo
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
