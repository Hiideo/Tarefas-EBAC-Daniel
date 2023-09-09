package br.com.dhideo.services;

import br.com.dhideo.dao.IProdutoDAO;
import br.com.dhideo.domain.Produto;
import br.com.dhideo.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }
}
