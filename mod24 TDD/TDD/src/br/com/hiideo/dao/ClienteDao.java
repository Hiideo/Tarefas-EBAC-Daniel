package br.com.hiideo.dao;

public class ClienteDao implements IClienteDao {

    public String salvar() {
        throw new UnsupportedOperationException("Não funciona sem config de banco");
        //return "Sucesso";
    }

    public String buscar() {
        throw new UnsupportedOperationException("A busca não conseguiu retornar nada com os dados que foram passados");
    }

    public String excluir() {
        throw new UnsupportedOperationException("Não possui nenhuma pessoa com o nome que foi passado");
    }

    public String atualizar() {
        throw new UnsupportedOperationException("Não foi possivel atualizar os dados , por favor tente novamente");
    }
}
