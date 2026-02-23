public class SeongChaeWon {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
