public class Exercicio2 {
    public static void main(String[] args){
        compara(args[0], args[1]);
    }
    public static void compara(String ... argm){
        boolean ehIgual = argm[0].equals(argm[1]);
        boolean ehIgualIgnoreCase = argm[0].equalsIgnoreCase(argm[1]);
        if(ehIgual){
            System.out.println("As strings SAO identicas!");
        }
        else{
            System.out.println("As strings NAO SAO identicas!");
        }

        if(ehIgualIgnoreCase){
            System.out.println("As strings SAO iguais, desconsiderando maiusculas e minusculas!");
        }
        else{
            System.out.println("As strings NAO SAO iguais, desconsiderando maiusculas e minusculas");
        }
    }
}
