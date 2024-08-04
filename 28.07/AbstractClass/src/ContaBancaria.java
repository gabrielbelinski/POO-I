public abstract class ContaBancaria {
    private String nome;
    private double saldo = 0;

    public abstract void retira(double valor);
    public ContaBancaria(String nome1){
        this.nome = nome1;
    }

    public void deposita(double valor){
        System.out.println("Foram depositados R$ " + (valor) + " na conta!");
        this.saldo += valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo1) {
        this.saldo = saldo1;
    }
}
