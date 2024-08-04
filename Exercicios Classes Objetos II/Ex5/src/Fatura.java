public class Fatura {
    private String num, des;
    private int qtd;
    private double preco;

    public String getNum() {
        return num;
    }

    public String getDes() {
        return des;
    }

    public int getQtd() {
        return qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setNum(String num1){
        num = num1;
    }

    public void setDes(String des1){
        des = des1;
    }

    public void setQtd(int qtd1){
        qtd = qtd1;
    }

    public void setPreco(double preco1){
        preco = preco1;
    }

    public double getQtdeFatura(int qt1, double pr1){
        return qt1 * pr1;
    }
}
