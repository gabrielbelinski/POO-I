import java.util.*;
public class UsaFatura {
    public static void main(String[] args){
        Fatura fatura1 = new Fatura();

        Scanner scan = new Scanner(System.in);

        System.out.print("\tEntre com o numero do produto: ");
        String aux1 = scan.nextLine();
        System.out.print("\n\tDescrição: ");
        String aux2 = scan.nextLine();
        System.out.print("\n\tQuantidade: ");
        String aux3 = scan.nextLine();
        int qtt = Integer.parseInt(aux3);
        System.out.print("\n\tPreço: ");
        String aux4 = scan.nextLine();
        double vll = Double.parseDouble(aux4);
        scan.close();

        System.out.println();

        fatura1.setNum(aux1);
        fatura1.setDes(aux2);
        fatura1.setQtd(qtt);
        fatura1.setPreco(vll);

        System.out.println("NUMERO: " + fatura1.getNum());
        System.out.println("DESCRICAO: " + fatura1.getDes());
        System.out.println("QUANTIDADE: " + fatura1.getQtd());
        System.out.println("PREÇO: " + fatura1.getPreco());

        System.out.println();
        System.out.println("QTD * PREÇO: " + fatura1.getQtdeFatura(fatura1.getQtd(), fatura1.getPreco()));
    }
}
