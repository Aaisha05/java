
import java.util.Scanner;

public class Bottleneck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int s = 1;

        int[] counts = new int[100001]; 

        for (int i = 0; i < a; i++) {
            int num = scanner.nextInt();
            counts[num]++;
            s = Math.max(counts[num], s);
        
        }

        System.out.println(s);
    }
}
