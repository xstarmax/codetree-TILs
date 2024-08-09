import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] grid = new int[N + 1][N + 1]; // initialize grid with 0s
        int[] dx = {-1, 1, 0, 0}; // up, down, left, right
        int[] dy = {0, 0, -1, 1}; // up, down, left, right

        for (int i = 0; i < M; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            grid[r][c] = 1; // mark the cell as colored

            int count = 0;
            for (int j = 0; j < 4; j++) {
                int nr = r + dx[j];
                int nc = c + dy[j];

                if (nr >= 1 && nr <= N && nc >= 1 && nc <= N && grid[nr][nc] == 1) {
                    count++;
                }
            }

            if (count == 3) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}