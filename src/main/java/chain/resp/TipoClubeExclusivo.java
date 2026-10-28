package chain.resp;

public class TipoClubeExclusivo implements TipoClube {

    private static TipoClubeExclusivo tipoClubeExclusivo = new TipoClubeExclusivo();

    private TipoClubeExclusivo() {};

    public static TipoClubeExclusivo getTipoClubeExclusivo() {
        return tipoClubeExclusivo;
    }

}
