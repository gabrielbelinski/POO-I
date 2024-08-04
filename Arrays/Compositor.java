public class Compositor {
    private String codigo, nome;

    public Compositor(){
    }
    public Compositor(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    void setCodigo(String codigo1){
        codigo = codigo1;
    }

    void setNome(String nome1){
        nome = nome1;
    }

    String getCodigo(){
        return codigo;
    }

    String getNome(){
        return nome;
    }
}
