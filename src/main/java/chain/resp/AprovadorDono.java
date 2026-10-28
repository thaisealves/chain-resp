package chain.resp;

public class AprovadorDono extends Aprovador {

    public AprovadorDono(Aprovador superior) {
        listaTiposClube.add(TipoClubeExclusivo.getTipoClubeExclusivo());
        setSuperior(superior);
    }

    @Override
    public String getCargo() {
        return "Dono";
    }

}
