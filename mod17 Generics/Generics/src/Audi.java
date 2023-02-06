public class Audi<Y,T,R,E> extends Carro{
    Audi(Y estilo,T km, R tipoComb, E cor){
        super(estilo,km,tipoComb,cor);
    }

    @Override
    public String toString() {
        return "Audi "+estilo+
                "\n{" + km +
                "km/h , Combustivel: " + tipoComb +
                " , Cor: " + cor +"}\n";
    }


}
