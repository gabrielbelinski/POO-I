public class ContaSimples extends ContaBancaria{


    public ContaSimples(String nome1){
        super(nome1);
    }

    @Override
    public void retira(double valor) {
        double value = getSaldo();
        System.out.println("Foram retirados R$ " + (valor) + " da conta!");
        setSaldo((value -= valor));
        value = getSaldo();
        System.out.println("Novo saldo: R$ " + value);
    }


}
