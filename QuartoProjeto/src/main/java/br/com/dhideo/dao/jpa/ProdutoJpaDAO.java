package br.com.dhideo.dao.jpa;

import br.com.dhideo.dao.generic.jpa.GenericJpaDAO;
import br.com.dhideo.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class);
    }

}
