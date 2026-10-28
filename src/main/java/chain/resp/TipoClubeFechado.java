package chain.resp;

public class TipoClubeFechado implements TipoClube {

    private static TipoClubeFechado tipoClubeFechado = new TipoClubeFechado();

    private TipoClubeFechado() {};

    public static TipoClubeFechado getTipoClubeFechado() {
        return tipoClubeFechado;
    }

}
