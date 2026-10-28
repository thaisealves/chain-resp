package chain.resp;

public class TipoClubeAberto implements TipoClube {

    private static TipoClubeAberto tipoClubeAberto = new TipoClubeAberto();

    private TipoClubeAberto() {};

    public static TipoClubeAberto getTipoClubeAberto() {
        return tipoClubeAberto;
    }

}
