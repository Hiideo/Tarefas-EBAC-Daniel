public abstract class Pessoa {

    //*O exercio ele pede apenas para criar as classes e propriedades , mas a unica propriedade
    //uma pessoa fisica tem de uma juridica é o CNPJ de resto é tudo igual
    //e ele não pediu que fosse executado nada apenas as classes e propriedades entao é isso eu acho...
    //
    private String nome;
    private String sobreNome;
    private String dataN;
    private Long tel;
    private Long cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getDataN() {
        return dataN;
    }

    public void setDataN(String dataN) {
        this.dataN = dataN;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
}