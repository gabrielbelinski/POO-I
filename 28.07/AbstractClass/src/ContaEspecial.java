public class ContaEspecial extends ContaBancaria{

    private double adicional;

    public ContaEspecial(String nome1, double adicional){
        super(nome1);
        this.adicional = adicional;
    }

    @Override
    public void retira(double valor) {
        double value = getSaldo();
        if(valor >= value && valor <= adicional){
            System.out.println("Foram retirados R$ " + (adicional + valor) + " da conta!");
            value = 0;
            setSaldo(value);
            value = getSaldo();
            System.out.println("Novo saldo: R$ " + value);
        }
        else{
            System.out.println("Foram retirados R$ " + (valor) + " da conta!");
            setSaldo(value -= valor);
            value = getSaldo();
            System.out.println("Novo saldo: R$ " + value);
        }

    }
}
