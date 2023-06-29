package controle;
public class ContinueRotulado {
    public static void main(String[] args) {
        externo: for(int i = 0; i < 3; i++) {
            interno: for(int j = 0; j < 3; j++) { // esse rótulo "interno" não precisa, só para fins didáticos
                if(i == 1) {
                    continue externo; // nesse caso não vai ter muita diferença no resultado usando o rótulo
                }
                System.out.printf("[%d %d] ", i, j);
            }

            System.out.println();
        }
        System.out.println("Fim!");

    }
}
