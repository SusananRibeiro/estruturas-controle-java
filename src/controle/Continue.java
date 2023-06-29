package controle;
public class Continue {
    public static void main(String[] args) {

        System.out.println("--- FOR só com números pares ---");
        for(int i = 0; i < 10; i++) {
            if(i % 2 == 1) { // só números pares
                continue;
            }

            System.out.println(i);
        }
        System.out.println("\n--- FOR sem mostrar o número 5 ---");

        for(int i = 1; i <= 10; i++) {
            if(i == 5) { // não vai imprimir o número 5
                continue;
            }
            System.out.println(i);
        }
    }
}
