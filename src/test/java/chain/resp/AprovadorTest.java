package chain.resp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AprovadorTest {

    AprovadorDono dono;
    AprovadorAdministrador administrador;
    AprovadorModerador moderador;

    @BeforeEach
    void setUp() {
        dono = new AprovadorDono(null);
        administrador = new AprovadorAdministrador(dono);
        moderador = new AprovadorModerador(administrador);
    }

    @Test
    void deveRetornarModeradorParaAprovacaoClubeAberto() {
        Clube clube = new Clube("Leitores de Tolkien", TipoClubeAberto.getTipoClubeAberto());
        assertEquals("Moderador", moderador.aprovarPedido(new PedidoEntrada("Ana", clube)));
    }

    @Test
    void deveRetornarAdministradorParaAprovacaoClubeFechado() {
        Clube clube = new Clube("Clube do Terror", TipoClubeFechado.getTipoClubeFechado());
        assertEquals("Administrador", moderador.aprovarPedido(new PedidoEntrada("Bia", clube)));
    }

    @Test
    void deveRetornarDonoParaAprovacaoClubeExclusivo() {
        Clube clube = new Clube("Círculo Secreto", TipoClubeExclusivo.getTipoClubeExclusivo());
        assertEquals("Dono", moderador.aprovarPedido(new PedidoEntrada("Caio", clube)));
    }

    @Test
    void deveRetornarSemAprovacaoParaClubeLivre() {
        Clube clube = new Clube("Clube da Esquina", TipoClubeLivre.getTipoClubeLivre());
        assertEquals("Sem aprovação", moderador.aprovarPedido(new PedidoEntrada("Duda", clube)));
    }

}
