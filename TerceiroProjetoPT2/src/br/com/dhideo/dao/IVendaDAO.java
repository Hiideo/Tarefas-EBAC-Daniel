package br.com.dhideo.dao;

import br.com.dhideo.dao.generic.IGenericDAO;
import br.com.dhideo.domain.Venda;
import br.com.dhideo.exceptions.DAOException;
import br.com.dhideo.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}

