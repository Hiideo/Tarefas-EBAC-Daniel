package br.com.dhideo.services;

import br.com.dhideo.domain.Cliente;
import br.com.dhideo.exceptions.DAOException;
import br.com.dhideo.exceptions.TipoChaveNaoEncontradaException;
import br.com.dhideo.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

    //	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
    Cliente buscarPorCPF(Long cpf) throws DAOException;

}
