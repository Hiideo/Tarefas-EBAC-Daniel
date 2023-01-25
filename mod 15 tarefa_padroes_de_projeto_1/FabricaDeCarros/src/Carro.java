public abstract class Carro {
    private int cavalos;
    private String tipoCombustivel;
    private String cor;

    public Carro(int cavalos,String tipoCombustivel,String cor){
        this.cavalos=cavalos;
        this.tipoCombustivel=tipoCombustivel;
        this.cor=cor;
    }

    public void montagem(){
        System.out.println(getClass().getSimpleName());
        System.out.println("Seu carro esta sendo montado com os componentes que foram solicitados : "+cavalos+","+tipoCombustivel+","+cor);
    }

    public void limpeza(){
        System.out.println("Seu carro foi higienizado");
    }

    public void checandoMec(){
        System.out.println("Componentes mecanicos foram checados , estão em perfeito estado");
    }

    public void combustivel(){
        System.out.println("Seu carro foi abastecido com : "+tipoCombustivel);
    }


}
