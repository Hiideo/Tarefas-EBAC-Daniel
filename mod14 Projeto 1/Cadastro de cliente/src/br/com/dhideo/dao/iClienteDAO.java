package br.com.dhideo.dao;

import br.com.dhideo.domain.Cliente;

import java.util.Collection;

public interface iClienteDAO {

    public Boolean cadastrar(Cliente cliente);

    public void excluir(Long cpf);

    public void alterar(Cliente cliente);

    public Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTodos();
}
