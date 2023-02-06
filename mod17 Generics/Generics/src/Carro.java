public abstract class Carro<Y,T,R,E> {
    T km;
    R tipoComb;
    E cor;
    Y estilo;

    public Carro(Y estilo,T km,R tipoComb,E cor){
        this.estilo=estilo;
        this.km=km;
        this.tipoComb=tipoComb;
        this.cor=cor;
    }

    public Y getEstilo() {
        return estilo;
    }

    public T getKm() {
        return km;
    }

    public R getTipoComb() {
        return tipoComb;
    }

    public E getCor() {
        return cor;
    }



}
