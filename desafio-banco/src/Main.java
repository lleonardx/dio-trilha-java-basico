public class Main {
    public static void main(String[] args) {

        Cliente leonardo = new Cliente();
        leonardo.setNome("Leonardo");

        Conta cc = new ContaCorrente(leonardo);
        Conta pp = new ContaPoupanca(leonardo);

        //Deposito
        cc.depositar(100);
        pp.depositar(500);
        cc.imprimirExtrato();

        //Extrato
        pp.imprimirExtrato();

        //Transferindo
        cc.transferir(100, pp);

        //Extrato
        cc.imprimirExtrato();
        pp.imprimirExtrato();
    }
}
