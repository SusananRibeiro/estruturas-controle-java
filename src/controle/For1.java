package controle;

public class For1 {

    public static void main(String[] args) {

        // Exemplo 1
        for(int contador = 1; contador <= 10; contador++) {
            System.out.printf("i = %d\n", contador);

        }

        // Exemplo 2
        int x = 2;
        for(; x < 10;) {
            System.out.println("x = " + x);
            x++;
        }

        // Laço Infinito
//		for(; ;) {
//			System.out.println("Sem FIM!");
//		}
    }
}

