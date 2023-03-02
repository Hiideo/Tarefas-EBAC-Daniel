package br.com.hiideo;

public class TesteCliente {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarNome(String nome) {
        setNome(nome);
    }

    public void adicionarNome1(String nome) {
        setNome(nome);
    }

    public String buscarNome(String nome) {
        this.nome=nome;
        return nome;
    }

    public String buscarNome1(String nome) {
        this.nome=nome;
        return nome;
    }
    public Object excluirNome(String nome) {
        this.nome=nome;
        return null;
    }

    public Object excluirNome1(String nome) {
        this.nome=nome;
        return null;
    }
    public void atualizarNome(String nome) {
        String novoNome = new String();
        this.nome=nome.replace(nome,novoNome);
    }

    public void atualizarNome1(String nome) {
        String novoNome = new String();
        this.nome=nome.replace(nome,novoNome);
    }
}
