import java.util.*;

public class SeparandoAvancado2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite os nomes e sexos conforme o Exemplo: \n Daniel-M,Aline-F,etc ");
        String[] vetStr = ler.next().split(",");
        ArrayList<String> listaM = new ArrayList<>();
        ArrayList<String> listaF = new ArrayList<>();
        for(int i=0;i<vetStr.length;i++){
            if (vetStr[i].endsWith("M")){
                listaM.add(vetStr[i].substring(0,vetStr[i].length()-2));
            }else if (vetStr[i].endsWith("F")){
                listaF.add(vetStr[i].substring(0,vetStr[i].length()-2));
            }
        }
        Collections.sort(listaM);
        Collections.sort(listaF);
        System.out.println("Lista de Homens :"+listaM);
        System.out.println("Lista de Mulheres :"+listaF);
    }
    }