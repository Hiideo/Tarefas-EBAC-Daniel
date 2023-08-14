package br.com.dhideo.dao;

import br.com.dhideo.domain.Catalogo;
import br.com.dhideo.domain.Marca;

public interface ICatalogoDao {
    Catalogo cadastrar(Catalogo cat);

    Catalogo buscarPorCodigoMarca(String codigoMarca);

    Catalogo buscarPorMarca(Marca marca);

    Catalogo buscarPorCodigoMarcaCriteria(String codigoMarca);

    Catalogo buscarPorMarcaCriteria(Marca marca);
}
