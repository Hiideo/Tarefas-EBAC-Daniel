package br.com.hiideo.dao;

public class ContratoDao implements IContratoDao {

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }
    public void buscar() {
        throw new UnsupportedOperationException("A busca não conseguiu retornar nada com os dados que foram passados");
    }
    public void excluir() {
        throw new UnsupportedOperationException("Não possui nenhuma pessoa com o nome que foi passado");
    }
    public void atualizar() {
        throw new UnsupportedOperationException("Não foi possivel atualizar os dados , por favor tente novamente");
    }
}
