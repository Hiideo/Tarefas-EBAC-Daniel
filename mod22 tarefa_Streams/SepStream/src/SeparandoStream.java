import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeparandoStream {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite os nomes e sexos conforme o Exemplo: \n Daniel-M,Aline-F,etc ");
        String[] vetStr = ler.next().split(",");
        ArrayList<Pessoa> listaPessoa = new ArrayList<>();
        for (int i = 0; i < vetStr.length; i++) {
            Pessoa pessoa = new Pessoa();
            pessoa.setNome(vetStr[i].substring(0, vetStr[i].length() - 2));
            pessoa.setGenero(vetStr[i].substring(vetStr[i].length() - 1, vetStr[i].length()));
            listaPessoa.add(pessoa);
        }
        listaPessoa.stream()
                .filter(pessoa -> pessoa.getGenero().equals("F"))
                .forEach(pessoa -> System.out.println(pessoa.getNome()));
    }
}