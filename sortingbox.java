import java.util.Scanner;

public class sortingbox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] boxes = new int[n];
        for (int i = 0; i < n; i++) {
            boxes[i] = scanner.nextInt();
        }

        int min = boxes[0];
        int max = boxes[0];
        for (int i = 0; i < n; i++) {
            if (min > boxes[i]) {
                min = boxes[i];
            }
            if (max < boxes[i]) {
                max = boxes[i];
            }
        }

        int effort = 2 * boxes[k - 1] * min + (min * max);
        System.out.println(effort);
    }
}
