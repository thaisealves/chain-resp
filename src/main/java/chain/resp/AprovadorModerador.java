package chain.resp;

public class AprovadorModerador extends Aprovador {

    public AprovadorModerador(Aprovador superior) {
        listaTiposClube.add(TipoClubeAberto.getTipoClubeAberto());
        setSuperior(superior);
    }

    @Override
    public String getCargo() {
        return "Moderador";
    }

}
