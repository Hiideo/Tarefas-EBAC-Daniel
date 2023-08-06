import br.com.dhideo.dao.IProdutoDAO;
import br.com.dhideo.dao.ProdutoDAO;
import br.com.dhideo.domain.Produto;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ProdutoTest {

    private IProdutoDAO produtoDAO;

    public ProdutoTest() {
        produtoDAO = new ProdutoDAO();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("A1");
        produto.setDescricao("PRODUTO TESTE");
        produto.setNome("PRODUTO EXEMPLO");
        produto = produtoDAO.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }
}
