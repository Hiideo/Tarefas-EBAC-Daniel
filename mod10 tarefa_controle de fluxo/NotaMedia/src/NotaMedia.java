import java.util.Scanner;

public class NotaMedia {
    public static void main(String[] args) {
        Scanner lernota = new Scanner(System.in);
        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float media;

        System.out.println("Digite as sua primeira nota:");
        nota1=lernota.nextFloat();
        System.out.println("Digite as sua primeira nota:");
        nota2=lernota.nextFloat();
        System.out.println("Digite as sua primeira nota:");
        nota3=lernota.nextFloat();
        System.out.println("Digite as sua primeira nota:");
        nota4=lernota.nextFloat();

        media=(nota1+nota2+nota3+nota4)/4;
        if (media>=7){
            System.out.println("Parabéns você ficou com "+media+" de media e foi aprovado");
        } else if (media>=5 && media<7) {
            System.out.println("Você ficou com "+media+" de media e esta de recuperação");
        }else{
            System.out.println("Lamento você ficou com "+media+" de media e não foi aprovado dessa vez");
        }
    }
}