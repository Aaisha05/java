import java.util.Scanner;

public class fibonaccik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 13-digit number (n): ");
        long n = scanner.nextLong();

        if (isValidInput(n)) {
            System.out.println("Fibonacci series up to the " + n + "th term:");
            printFibonacciSeries(n);
        } else {
            System.out.println("Invalid input. Please enter a 13-digit number.");
        }

        scanner.close();
    }

    static void printFibonacciSeries(long n) {
        long first = 0, second = 1;

        for (int i = 1; i <= n; ++i) {
            System.out.print(first + " ");

            long next = first + second;
            first = second;
            second = next;
        }
    }

    static boolean isValidInput(long n) {
        return String.valueOf(n).length() == 13;
 \   }
}