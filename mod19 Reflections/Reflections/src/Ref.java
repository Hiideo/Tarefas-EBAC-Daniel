import java.io.Serializable;
public class Ref implements iChave, Serializable {
    @Chave("Tabela")
    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}