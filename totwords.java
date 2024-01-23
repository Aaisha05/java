import java.util.Scanner;

public class totwords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");

        int wordCount = words.length;

        System.out.println("Total words in the string: " + wordCount);

        scanner.close();
    }
}
