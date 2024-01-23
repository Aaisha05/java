import java.util.Scanner;

public class marathon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Rows and Columns of the box
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        // Input: Position and Direction of the first target ball
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int dx1 = scanner.nextInt();
        int dy1 = scanner.nextInt();

        // Input: Position and Direction of the second target ball
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int dx2 = scanner.nextInt();
        int dy2 = scanner.nextInt();

        // Output: Minimum number of steps for both balls to overlap
        int steps = getOverlapSteps(M, N, x1, y1, dx1, dy1, x2, y2, dx2, dy2);
        System.out.println(steps >= 0 ? steps : "Never");
    }

    private static int getOverlapSteps(int M, int N, int x1, int y1, int dx1, int dy1, int x2, int y2, int dx2, int dy2) {
        for (int step = 1; step <= M * N; step++) {
            x1 += dx1;
            y1 += dy1;
            x2 += dx2;
            y2 += dy2;

            if (x1 == x2 && y1 == y2) {
                return step;
            }

            // Adjust the direction of ball 1
            if ((x1 == 1 && dx1 == -1) || (x1 == M && dx1 == 1)) {
                dx1 = -dx1;
            }

            if ((y1 == 1 && dy1 == -1) || (y1 == N && dy1 == 1)) {
                dy1 = -dy1;
            }

            // Adjust the direction of ball 2
            if ((x2 == 1 && dx2 == -1) || (x2 == M && dx2 == 1)) {
                dx2 = -dx2;
            }

            if ((y2 == 1 && dy2 == -1) || (y2 == N && dy2 == 1)) {
                dy2 = -dy2;
            }
        }

        return -1; // If no overlap is found within M * N steps
    }
}
