import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SeparandoAvancado {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite os nomes separados por ,");
        String dados = ler.next();
        String[] vetorString = dados.split(",");
        String[] vet = vetorString;
        List<String> alfabetica = new ArrayList<>();

        for(int i=0;i<vet.length;i++){
            alfabetica.add(vet[i]);
        }
        Collections.sort(alfabetica);
        System.out.println("Lista de nomes ordenados : "+alfabetica);
    }
}