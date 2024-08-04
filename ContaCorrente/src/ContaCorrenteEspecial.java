public class ContaCorrenteEspecial extends ContaCorrente{

    public ContaCorrenteEspecial(double saldo){
        super(saldo);
    }

    @Override
    public double taxaOperacao(){
        return 0.01;
    }
}
