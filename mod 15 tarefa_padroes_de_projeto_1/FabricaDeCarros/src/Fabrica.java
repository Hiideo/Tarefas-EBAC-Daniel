import java.util.Scanner;

public class Fabrica{
        public Carro criarCarro(){
                Carro carro = escolha();
                carro.montagem();
                prepararCarro(carro);
                return carro;
        }

        private Carro escolha(){
                System.out.println("Digite 1 para Audi e 2 para BMW");
                Scanner ler = new Scanner(System.in);
                if ("1".equals(ler.nextLine())){
                        return new Audi(200,"Alcool","Vermelho");
                }else if ("2".equals(ler.nextLine())){
                        return new BMW(180,"Gasolina","Azul");
                }return null;
        }
        private Carro prepararCarro(Carro carro){
                carro.checandoMec();
                carro.combustivel();
                carro.limpeza();
                return carro;
        }
}