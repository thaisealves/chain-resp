package chain.resp;

public class Clube {

    private String nome;
    private TipoClube tipoClube;

    public Clube(String nome, TipoClube tipoClube) {
        this.nome = nome;
        this.tipoClube = tipoClube;
    }

    public String getNome() {
        return nome;
    }

    public TipoClube getTipoClube() {
        return tipoClube;
    }

}
