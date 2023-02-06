public class BMW<Y,T,R,E> extends Carro{
    BMW(Y estilo,T km, R tipoComb, E cor){
        super(estilo,km,tipoComb,cor);
    }

    @Override
    public String toString() {
        return "BMW "+estilo+
                "\n{" + km +
                "km/h , Combustivel: " + tipoComb +
                " , Cor: " + cor +"}\n";
    }
}
