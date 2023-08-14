import br.com.dhideo.dao.*;
import br.com.dhideo.domain.Acessorio;
import br.com.dhideo.domain.Carro;
import br.com.dhideo.domain.Catalogo;
import br.com.dhideo.domain.Marca;
import org.junit.Test;

import java.time.Instant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CatalogoTest {
    private ICatalogoDao catalogoDao;

    private IMarcaDao marcaDao;

    private ICarroDao carroDao;

    private IAcessorioDao acessorioDao;

    public CatalogoTest() {
        catalogoDao = new CatalogoDao();
        marcaDao = new MarcaDao();
        carroDao = new CarroDao();
        acessorioDao = new AcessorioDao();
    }

    @Test
    public void cadastrar() {
        Marca marca = criarMarca("A1");
        Carro carro = criarCarro("A1");

        Catalogo cat = new Catalogo();
        cat.setCodigo("A1");
        cat.setDataCatalogo(Instant.now());
        cat.setStatus("ATIVA");
        cat.setValor(2000d);
        cat.setMarca(marca);
        cat.setCarro(carro);

        carro.setCatalogo(cat);
        cat = catalogoDao.cadastrar(cat);

        assertNotNull(cat);
        assertNotNull(cat.getId());

        Catalogo catBD = catalogoDao.buscarPorCodigoMarca(cat.getCodigo());
        assertNotNull(catBD);
        assertEquals(cat.getId(), catBD.getId());

        Catalogo catBDObj = catalogoDao.buscarPorMarca(marca);
        assertNotNull(catBDObj);
        assertEquals(cat.getId(), catBDObj.getId());
    }

    private Acessorio criarAcessorio(String codigo) {
        Acessorio acess = new Acessorio();
        acess.setCodigo(codigo);
        acess.setDescricao("Comp 1");
        return acess;
    }

    private Carro criarCarro(String codigo) {
        Acessorio acess = criarAcessorio("A1");
        Acessorio acess2 = criarAcessorio("A2");
        Carro carro = new Carro();
        carro.setCodigo(codigo);
        carro.setNome("Rodrigo");
        carro.add(acess);
        carro.add(acess2);
        return carroDao.cadastrar(carro);
    }

    private Marca criarMarca(String codigo) {
        Marca marca = new Marca();
        marca.setCodigo(codigo);
        marca.setDescricao("Marca teste");
        marca.setNome("Marca 1");
        return marcaDao.cadastrar(marca);
    }
}
