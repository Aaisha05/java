import java.util.Scanner;
import java.util.Arrays;

public class New {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = findnum(a, b);
        System.out.println(result);
    }

    private static int findnum(int a, int b) {
        char[] achars = Integer.toString(a).toCharArray();

        for (int i = achars.length - 2; i >= 0; i--) {
            for (int j = achars.length - 1; j > i; j--) {
                if (achars[i] < achars[j]) {
                    char temp = achars[i];
                    achars[i] = achars[j];
                    achars[j] = temp;
                    Arrays.sort(achars, i + 1, achars.length);
                    int newnum = Integer.parseInt(new String(achars));
                    if (newnum > b) {
                        return newnum;
                    }
                }
            }
        }
        return -1;
    }
}
