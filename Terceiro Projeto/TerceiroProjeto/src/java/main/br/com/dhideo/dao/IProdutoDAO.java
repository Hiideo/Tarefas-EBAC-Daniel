package br.com.dhideo.dao;

import br.com.dhideo.domain.Produto;

public interface IProdutoDAO {
	
	public Integer cadastrar(Produto produto) throws Exception;

	public Produto consultar(String produto) throws Exception;

	public Integer excluir(Produto produtoDB) throws Exception;
}
