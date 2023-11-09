public abstract class Conta implements IConta {
    private int agencia;
    private int conta;
    private double saldo;

    //Getters
    public int getAgencia() {
        return agencia;
    }
    public int getConta() {
        return conta;
    }
    public double getSaldo() {
        return saldo;
    }


    //Implementação da Interface
    public void sacar(double valor) {
        System.out.println("");
    }
    public void depositar(double valor) {
        System.out.println("");
    }
    public void transferir(double valor, Conta contaDestino) {
        System.out.println("");
    }

}
