import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String entrada = scan.nextLine();
        scan.close();
        boolean tamCorreto = entrada.length() >= 8;

        if(tamCorreto){
            String palavraFormada = verificaPalavra(entrada);
            System.out.println(palavraFormada);
        }
        else{
            System.out.println("Erro: A string possui menos elementos do que o exigido");
        }

    }

    public static String verificaPalavra(String str){
        String aux1 = str.substring(0,2);
        String aux2 = str.substring(str.length() - 2, str.length());

        return aux1 += aux2;
    }
}
