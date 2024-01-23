
import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int five = (n - 4) / 5;
        int remaining = n - 5 * five;

        int one = (remaining % 2) == 1 ? 1 : 2;                                                                                                                     

        int two = (n - 5 * five - one) / 2;
        System.out.println((five + one + two) + " " + five + " " + two + " " + one);
        scanner.close();
    }
}
