public class TestaContasBancarias {

    public static void main(String[] args){

        ContaSimples c1 = new ContaSimples("Ana");
        ContaEspecial c2 = new ContaEspecial("Bolena", 15000);

        c1.setSaldo(12000);

        c1.deposita(12000);

        c1.retira(1);

        c2.deposita(15000);

        c2.retira(15000);
    }
}