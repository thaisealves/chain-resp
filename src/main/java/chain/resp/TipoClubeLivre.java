package chain.resp;

public class TipoClubeLivre implements TipoClube {

    private static TipoClubeLivre tipoClubeLivre = new TipoClubeLivre();

    private TipoClubeLivre() {};

    public static TipoClubeLivre getTipoClubeLivre() {
        return tipoClubeLivre;
    }

}
