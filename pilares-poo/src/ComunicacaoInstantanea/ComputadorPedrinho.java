package ComunicacaoInstantanea;

public class ComputadorPedrinho {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;
        /*
         * Não sei o app, mas qualquer um vai excutar.
         */
        MSNMessenger msn = new MSNMessenger();
        System.out.println("MSN Messenger.");
        msn.enviarMensagem();
        msn.receberMensagem();
        System.out.println("");

        System.out.println("Facebook Messenger.");
        FacebookMessenger fcb = new FacebookMessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();
        System.out.println("");

        System.out.println("Telegram.");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
