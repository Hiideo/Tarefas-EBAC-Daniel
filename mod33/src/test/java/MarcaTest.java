import br.com.dhideo.dao.IMarcaDao;
import br.com.dhideo.dao.MarcaDao;
import br.com.dhideo.domain.Marca;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MarcaTest {
    private IMarcaDao marcaDao;

    public MarcaTest() {
        marcaDao = new MarcaDao();
    }

    @Test
    public void cadastrar() {
        Marca marca = new Marca();
        marca.setCodigo("A1");
        marca.setDescricao("CURSO TESTE");
        marca.setNome("Curso de Java Backend");
        marca = marcaDao.cadastrar(marca);

        assertNotNull(marca);
        assertNotNull(marca.getId());
    }
}
