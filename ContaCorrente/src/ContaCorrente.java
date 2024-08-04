 class ContaCorrente {
    private double saldo;

    public ContaCorrente(double saldo1) {
        this.saldo = saldo1;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void depositar(double saldo){
        this.saldo += saldo;
    }

    public double taxaOperacao(){
        return 0.05;
    }
    public void sacar(double saldo){
        this.saldo -= saldo + (saldo*taxaOperacao());
    }
}
