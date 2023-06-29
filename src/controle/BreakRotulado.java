package controle;
public class BreakRotulado {
    public static void main(String[] args) {

        externo: for(int i = 0; i < 3; i++) {
            interno: for(int j = 0; j < 3; j++) { // esse rótulo "interno" não precisa, só para fins didáticos
                if(i == 1) {
                    break externo; // para informar de qual laço precisa sair
                }
                System.out.printf("[%d %d] ", i, j);
            }

            System.out.println();
        }
        System.out.println("Fim!");
    }
}
