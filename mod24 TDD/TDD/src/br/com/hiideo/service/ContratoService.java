package br.com.hiideo.service;

import br.com.hiideo.dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Salvo com sucesso";
    }

    public String buscar() {
        contratoDao.buscar();
        return "Encontrado com sucesso";
    }

    public String excluir() {
        contratoDao.excluir();
        return "Excluido com sucesso";
    }

    public String atualizar() {
        contratoDao.atualizar();
        return "Dados atualizados com sucesso";
    }
}
