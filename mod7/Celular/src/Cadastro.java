public class Cadastro {
    public String nome;
    public int cpf;
    public String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void nomeProprietario(String nome){
        this.nome= "Bem-Vindo Daniel";
    }
}
