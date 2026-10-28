package chain.resp;

public class PedidoEntrada {
    private String usuario;
    private Clube clube;

    public PedidoEntrada(String usuario, Clube clube) {
        this.usuario = usuario;
        this.clube = clube;
    }

    public String getUsuario() {
        return usuario;
    }

    public Clube getClube() {
        return clube;
    }

}
