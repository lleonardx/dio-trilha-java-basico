package ComunicacaoInstantanea;

public class MSNMessenger extends ServicoMensagemInstantanea {
    
    @Override
    public void enviarMensagem(){
        System.out.println("Enviando Mensagem pelo MSN Messenger.");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recendo Mensagem pelo MSN Messenger.");
    }
    
}