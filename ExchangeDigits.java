import java.util.*;

public class ExchangeDigits{
    static int a, b;

    public static int permutation(String num, int left, int right) {
        int solution = 10000000;
        boolean flag = false;

        char[] digits = num.toCharArray();
        for (int i = left; i <= right; i++) {
            swap(digits, left, i);
            int digit = Integer.parseInt(new String(digits));
            if (b < digit && digit < solution) {
                solution = digit;
                flag = true;
            }
            swap(digits, left, i);
        }

        if (!flag) return -1;

        String str1 = String.valueOf(solution);
        String str2 = String.valueOf(b);
        int i = 0;
        for (i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) > str2.charAt(i)) break;
        }

        char[] strArray = str1.toCharArray();
        Arrays.sort(strArray, i + 1, strArray.length);

        return Integer.parseInt(new String(strArray));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        String num = Integer.toString(a);
        int result = permutation(num, 0, num.length() - 1);
        System.out.println(result);
        sc.close();
    }

    public static void swap(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
