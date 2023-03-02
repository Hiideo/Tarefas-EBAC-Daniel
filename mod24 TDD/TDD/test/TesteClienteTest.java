import br.com.hiideo.TesteCliente;
import org.junit.Assert;
import org.junit.Test;

public class TesteClienteTest {

    @Test
    public void testeClasseCliente() {
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Daniel");
        cli.adicionarNome1("Daniel");
        cli.buscarNome("Daniel");
        cli.buscarNome1("Daniel");
        cli.excluirNome("Daniel");
        cli.excluirNome1("Daniel");
        cli.atualizarNome("Daniel Hideo Watanabe");
        cli.atualizarNome1("Daniel Hideo Watanabe");

        Assert.assertEquals("Daniel", cli.getNome());
    }
}