public class Media {
    /**
     * Eu criei o algoritimo na ideia que a media da escola fosse 7 que a chamei de mediaAceitavel
     * então todos os parametros foram em cima do valor da media de todas as notas em cima da aceitavel.
     * @param args
     */
    public static void main(String[] args) {
        verificacao();
    }
    public static void verificacao(){
        int primeiraNota=6;
        int segundaNota=8;
        int terceiraNota=10;
        int quartaNota=4;
        int mediaAceitavel=7;
        int mediaTotal;

        mediaTotal=(primeiraNota+segundaNota+terceiraNota+quartaNota)/4;
        System.out.println(mediaTotal);

        boolean eMaior=mediaTotal>mediaAceitavel;
        System.out.println("eMaior:" +eMaior);
        boolean eIgual=mediaTotal==mediaAceitavel;
        System.out.println("eIgual:" +eIgual);
        boolean eDiferente=mediaTotal!=mediaAceitavel;
        System.out.println("eDiferente:" +eDiferente);
        boolean eMaiorIgual=mediaTotal>=mediaAceitavel;
        System.out.println("eMaiorIgual:" +eMaiorIgual);
        boolean estaDentro=mediaTotal>=mediaAceitavel && mediaTotal<=mediaAceitavel;
        System.out.println("estaDentro:" +estaDentro);
        boolean esta_Dentro=mediaTotal>=mediaAceitavel || mediaTotal<=mediaAceitavel;
        System.out.println("esta_Dentro:" +esta_Dentro);
        boolean eNao=mediaTotal>=mediaAceitavel || mediaTotal<=mediaAceitavel;
        System.out.println("eNao:"+ !eNao);
    }
}