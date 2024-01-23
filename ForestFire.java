import java.util.Scanner;

public class ForestFire {
    static int M, N;
    static String[][] forest;
    static int[][] TimeMat;

    static void countTime(int row, int col, int currtime) {
        if (row < 0 || row >= M || col < 0 || col >= N) {
            return;
        }
        if (forest[row][col].equals("W")) {
            return;
        }
        if (TimeMat[row][col] != 0 && currtime >= TimeMat[row][col]) {
            return;
        }
        TimeMat[row][col] = currtime;

        countTime(row - 1, col, currtime + 1);
        countTime(row, col + 1, currtime + 1);
        countTime(row, col - 1, currtime + 1);
        countTime(row + 1, col + 1, currtime + 1);
        countTime(row - 1, col - 1, currtime + 1);
        countTime(row + 1, col, currtime + 1);
        countTime(row - 1, col + 1, currtime + 1);
        countTime(row + 1, col - 1, currtime + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        M = scanner.nextInt();
        N = scanner.nextInt();

        int irow = scanner.nextInt();
        int icol = scanner.nextInt();

        forest = new String[M][N];
        TimeMat = new int[M][N];

        for (int i = 0; i < M; ++i) {
            for (int j = 0; j < N; ++j) {
                forest[i][j] = scanner.next();
            }
        }

        countTime(irow - 1, icol - 1, 1);

        int Time = -1;
        for (int i = 0; i < M; ++i) {
            for (int j = 0; j < N; ++j) {
                if (Time < TimeMat[i][j]) {
                    Time = TimeMat[i][j];
                }
            }
        }

        System.out.println(Time);
    }
}
