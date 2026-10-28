package chain.resp;

public class AprovadorAdministrador extends Aprovador {

    public AprovadorAdministrador(Aprovador superior) {
        listaTiposClube.add(TipoClubeFechado.getTipoClubeFechado());
        setSuperior(superior);
    }

    @Override
    public String getCargo() {
        return "Administrador";
    }

}
