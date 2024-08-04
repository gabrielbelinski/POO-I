    public class Palestra {

        Luz luz;
        public Palestra(Luz luz){
            this.luz = luz;
        }
        public void acessa(){
            if(luz == Luz.VERMELHO){
                System.out.println("palestra indisponivel");
            }
            else if(luz == Luz.AMBAR){
                System.out.println("palestra sendo liberada");
            }
            else if(luz == Luz.VERDE){
                System.out.println("palestra disponivel");
            }
        }
    }
