package controle;
public class WhileDeterminado {

    public static void main(String[] args) {

        int contador = 0; // Começa a contar apartir do 1

        while(contador < 20) {
            System.out.printf("i = %d\n", contador);
            contador += 2; // vai fazer de 2 em 2, Não esquecer, se não colocar vai gerar um laço infinito
        }
    }
}
