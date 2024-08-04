public class Liquidificador {
    private boolean ligado;

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
    }

    public boolean isLigado(){
        if(ligado){
            return true;
        }
        else return false;
    }

    public void observar(){
        if(isLigado()) {
            System.out.println("Liquidificador ligado");
        }
        else if(!isLigado()){
            System.out.println("Liquidificador desligado");
        }

    }
}
