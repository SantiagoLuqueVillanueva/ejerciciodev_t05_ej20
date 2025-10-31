public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura: "));

        for (int i = 1; i <= altura ; i++) {
            for (int j = altura; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i; j++) {
                if (i == altura ) {
                    System.out.print("*");
                } else if (j == 0 || j == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
