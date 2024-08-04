import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        scan.close();

        String result = processa(s);
        System.out.println(result);
    }
    public static String processa(String st){
        if(st == null){
            return null;
        }
        else{
            return st.toUpperCase();
        }
    }
}
