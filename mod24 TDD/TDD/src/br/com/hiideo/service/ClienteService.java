package br.com.hiideo.service;

import br.com.hiideo.dao.ClienteDao;
import br.com.hiideo.dao.ClienteDaoMock;
import br.com.hiideo.dao.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        //clienteDao = new ClienteDao();
        //clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Salvo com sucesso";
    }

    public String buscar() {
        clienteDao.buscar();
        return "Encontrado com sucesso";
    }

    public String excluir() {
        clienteDao.excluir();
        return "Excluido com sucesso";
    }

    public String atualizar() {
        clienteDao.atualizar();
        return "Dados atualizados com sucesso";
    }
}
