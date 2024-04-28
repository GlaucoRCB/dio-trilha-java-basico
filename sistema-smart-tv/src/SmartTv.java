public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligar(){
        ligada=true;
        System.out.println("Ligando");
    }

    public void desligar(){
        ligada=false;
        System.out.println("Desligando");
    }

    public void aumentarVolume(){
        if(ligada==true)
            volume++;
            System.out.println("Volume:" + volume);
    }

    public void diminuirVolume(){
        if(ligada==true)
            volume--;
            System.out.println("Volume:" + volume);
    }

    public void aumentarCanal(){
        if(ligada==true)
            canal++;
            System.out.println("Canal:" + canal);
    }

    public void diminuirCanal(){
        if(ligada==true)
            canal--;
            System.out.println("Canal:" + canal);
    }

    public void mudarCanal(int novoCanal){
        if(ligada==true)
            canal = novoCanal;
            System.out.println("Canal:" + canal);
    }

}
