package services;

import domain.Produto;

public interface IProdutoService {
    Produto consultar(String codigo);

    Boolean cadastrar(Produto produto);

    void excluir(String codigo);

    void alterar(Produto produto);
}
