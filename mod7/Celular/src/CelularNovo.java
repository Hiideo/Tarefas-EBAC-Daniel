public class CelularNovo {
    /**
     * Este algoritimo esta fazendo uma simulação de uma inicialização de um celular recem comprado
     * onde você cadastra suas informações primeiro , apenas isso é um algoritimo basico.
     * @param args
     */
    public static void main(String[] args) {
        int sistema = 10;
        Cadastro cadastro=new Cadastro();
        cadastro.nomeProprietario("Daniel");

        for (int count = 0; count <= 10; count++) {
            sistema = count;
            System.out.println(sistema);
        }
        System.out.println("Sistema inicializado com sucesso");
        System.out.println(cadastro.getNome());
    }
}