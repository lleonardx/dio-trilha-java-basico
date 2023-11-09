package AparelhoTelefonico;

public class Phone implements Telefone {
    public void ligar() {
        System.out.println("Ligando para.");
    }
    public void atender() {
        System.out.println("Atendendo Ligação.");
    }
    public void iniciarCorreioVoz() {
       System.out.println("Iniciando Correio de Voz.");
    }

    
}