package chain.resp;

import java.util.ArrayList;
import java.util.List;

public abstract class Aprovador {

    protected List<TipoClube> listaTiposClube = new ArrayList<>();
    private Aprovador superior;

    public Aprovador getSuperior() {
        return superior;
    }

    public void setSuperior(Aprovador superior) {
        this.superior = superior;
    }

    public abstract String getCargo();

    public String aprovarPedido(PedidoEntrada pedido) {
        if (listaTiposClube.contains(pedido.getClube().getTipoClube())) {
            return getCargo();
        }
        else {
            if (superior != null) {
                return superior.aprovarPedido(pedido);
            }
            else {
                return "Sem aprovação";
            }
        }
    }

}
