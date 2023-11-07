public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //Metodos
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume: " + volume);
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando o Canal: " + canal);
    }
    public void diminuirCanal(){
        canal++;
        System.out.println("Diminuindo o Canal: " + canal);
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
