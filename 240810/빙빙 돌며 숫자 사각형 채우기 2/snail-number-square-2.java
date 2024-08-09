import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int dir = 0;
        int x = 0, y = 0;
        int num = 1;

        while (num <= n * m) {
            grid[x][y] = num++;
            int newX = x + dx[dir];
            int newY = y + dy[dir];

            if (newX < 0 || newX >= n || newY < 0 || newY >= m || grid[newX][newY] != 0) {
                dir = (dir + 1) % 4;
                newX = x + dx[dir];
                newY = y + dy[dir];
            }

            x = newX;
            y = newY;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}