import java.util.Scanner;

public class Jumbled1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l = scanner.nextInt();
        int u = scanner.nextInt();
        int k = scanner.nextInt();

        int[][] a = new int[u][];

        int result = 1;
        int counter = 0;

        for (int i = 0; i < u; i++) {
            result = i * (2 * i - 1);
            if (result > l) {
                if (counter == k - 1) {
                    System.out.println(result);
                    break;
                }
                counter++;
            }
        }
    }
}
