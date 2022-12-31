import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Separando {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        List<String> sexoM = new ArrayList<>();
        List<String> sexoF = new ArrayList<>();

        System.out.println("Qual seu nome ? ");
        pessoa.setNome(ler.nextLine());
        System.out.println("Qual seu sexo ? ");
        pessoa.setSexo(ler.nextLine());

        if (pessoa.sexo.contains("Masculino")){
            sexoM.add(pessoa.nome);
            System.out.println("Você esta do lado Masculino"+sexoM);
        }else{
            sexoF.add(pessoa.nome);
            System.out.println("Você esta do lado Feminino"+sexoF);
        }
    }
}