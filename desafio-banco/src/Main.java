public class Main {
    public static void main(String[] args) {

        Cliente leonardo = new Cliente();
        leonardo.setNome("Leonardo");

        Conta cc = new ContaCorrente(leonardo);
        Conta pp = new ContaPoupanca(leonardo);

        cc.depositar(100);
        cc.imprimirExtrato();

        pp.imprimirExtrato();

        //Transferindo
        cc.transferir(100, pp);

        cc.imprimirExtrato();
        pp.imprimirExtrato();
    }
}
