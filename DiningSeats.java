import java.util.Scanner;

public class DiningSeats {
    public static int fact(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int z = scanner.nextInt();

        for (int i = 0; i < z; i++) {
            int r = scanner.nextInt();
            int n = scanner.nextInt();

            if (r >= 10 || n >= 20) {
                System.out.println("Error r<=10 and n<=20");
                return;
            }

            int result = fact(n) / (fact(r) * fact(n - r));
            System.out.println(result);
        }
    }
}
