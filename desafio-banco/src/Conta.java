public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1024;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
    }

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
