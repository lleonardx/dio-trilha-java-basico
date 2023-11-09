import AparelhoTelefonico.Phone;
import AparelhoTelefonico.Telefone;
import NavegadorInternet.Internet;
import NavegadorInternet.Safari;
import ReprodutorMusical.Ipod;
import ReprodutorMusical.Spotify;

public abstract class Iphone implements Telefone, Internet, Ipod {
    public static void main(String[] args) {
        System.out.println("Telefone");
        Telefone tef = new Phone();
        tef.ligar();
        tef.atender();
        tef.iniciarCorreioVoz();
        System.out.println(" ");

        System.out.println("Internet");
        Internet internet = new Safari();
        internet.exibirPagina();
        internet.atualizarPagina();
        internet.adicionarPagina();
        System.out.println(" ");

        System.out.println("Musicas");
        Ipod music = new Spotify();
        music.tocar();
        music.selecionarMusica();
        music.selecionarMusica();
        
    }
    
}
