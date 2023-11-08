package ComunicacaoInstantanea;

public class FacebookMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem(){
        System.out.println("Enviando Mensagem pelo Facebook.");
    }
}
