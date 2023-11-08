package ComunicacaoInstantanea;

public class MSNMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando Mensagem pelo MSN Messenger.");
    }
    public void receberMensagem() {
        System.out.println("Recendo Mensagem pelo MSN Messenger.");
    }
    
}