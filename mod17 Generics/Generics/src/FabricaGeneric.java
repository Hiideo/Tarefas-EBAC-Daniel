import java.util.*;

public class FabricaGeneric {
    public static void main(String[]args){
        System.out.println("Para ver a lista de Audi digite '1'\nPara ver a lista de BMW digite '2'");
        Scanner scan = new Scanner(System.in);
        int escolha = scan.nextInt();
        Object S = null;
        if (escolha == 1){
            boolean a = S instanceof Audi;
            System.out.println(audiList());
        } else if (escolha == 2) {
            boolean b = S instanceof BMW;
            System.out.println(bmwList());
        }
    }

    public static List<Audi> audiList(){
        List<Audi> listaAudi = new ArrayList<>();
        Audi sedan = new Audi("SEDAN",230,"Alcool","Amarelo");
        listaAudi.add(sedan);
        Audi  hatch= new Audi("HATCH",220,"Gasolina","Branco");
        listaAudi.add(hatch);
        Audi pickup = new Audi("PICKUP",200,"Alcool","Verde");
        listaAudi.add(pickup);

        return listaAudi;
    }

    public static List<BMW> bmwList(){
        List<BMW> listaBMW= new ArrayList<>();
        BMW sporting = new BMW("SPORTING",250,"Alcool","Vermelho");
        listaBMW.add(sporting);
        BMW  pickup= new BMW("PICKUP",220,"Alcool","Azul");
        listaBMW.add(pickup);
        BMW sedan = new BMW("SEDAN",230,"Gasolina","Prata");
        listaBMW.add(sedan);
        return listaBMW;
    }
}
