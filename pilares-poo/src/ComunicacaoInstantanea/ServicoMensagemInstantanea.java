package ComunicacaoInstantanea;

public class ServicoMensagemInstantanea {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando Mensagem.");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo Mensagem.");
    }
    private void validarConectadoInternet(){
        System.out.println("Validando se tem Conexão a Internet.");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando Historico das Mensagens.");
    }

    
}