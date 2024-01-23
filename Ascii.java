import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        if (isSuperASCII(inputString)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean isSuperASCII(String str) {
        int[] count = new int[26];
        for (char ch : str.toCharArray()) {
            int index = ch - 'a';
            count[index]++;
        }

        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            if (count[index] != str.charAt(i) - 'a' + 1) {
                return false;
            }
        }

        return true;
    }
}
