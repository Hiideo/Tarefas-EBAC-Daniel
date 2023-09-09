package br.com.dhideo.dao.jpa;

import br.com.dhideo.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

    public ClienteJpaDAO() {
        super(ClienteJpa.class);
    }

}
