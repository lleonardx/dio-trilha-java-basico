public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        //chamada do metodo - ligar
        smartTv.ligar();
        System.out.println("Novo status => Tv Ligada : " + smartTv.ligada);

        //metodo desligar
        smartTv.desligar();
        System.out.println("Novo status => Tv Ligada : " + smartTv.ligada);

        //metodo diminuir e aumentar volume
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo status => Volume Atual: " + smartTv.volume);

        //metodo mudar de canal
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);

    }
}
