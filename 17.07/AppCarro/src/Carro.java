public class Carro {
    private String marca;
    private String modelo;
    private String fabricante;
    private Motor motor;
    private Bancos banco;

    public Carro(String marca, String modelo, String fabricante, Motor motor, Bancos banco) {
        this.marca = marca;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.motor = motor;
        this.banco = banco;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getFabricante() {
        return fabricante;
    }
    public String getTipoMotor() {
        return motor.getTipo();
    }

    public String getFabricanteBanco(){
        return banco.getFabricante();
    }

    @Override
    public String toString(){
        return this.marca + " " + this.modelo + " " + this.fabricante + " " + motor.toString() + " " + banco.toString();
    }


}