package controle;
import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;
        double media;

        while(nota != -1) {
            System.out.print("Informe a nota (ou -1 p/ sair): ");
            nota = entrada.nextDouble();

            if(nota >= 0 && nota <= 10) {
                total += nota;
                quantidadeDeNotas++;
            } else if(nota != -1) {
                System.out.println("Nota invalida!!! ;D");
            }
        }

        // Calcular a media
        media = total / quantidadeDeNotas;
        System.out.println("Media = " + media);

        entrada.close();
    }
}
