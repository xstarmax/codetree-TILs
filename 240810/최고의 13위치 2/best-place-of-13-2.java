import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[][] grid = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        int maxCoins = 0;
        for (int i = 0; i <= N - 3; i++) {
            for (int j = 0; j < N; j++) {
                int coins1 = countCoins(grid, i, j, i + 2, j);
                for (int k = 0; k <= N - 3; k++) {
                    for (int l = 0; l < N; l++) {
                        if (k >= i && k <= i + 2 && l == j) continue;
                        int coins2 = countCoins(grid, k, l, k + 2, l);
                        maxCoins = Math.max(maxCoins, coins1 + coins2);
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= N - 3; j++) {
                int coins1 = countCoins(grid, i, j, i, j + 2);
                for (int k = 0; k < N; k++) {
                    for (int l = 0; l <= N - 3; l++) {
                        if (k == i && l >= j && l <= j + 2) continue;
                        int coins2 = countCoins(grid, k, l, k, l + 2);
                        maxCoins = Math.max(maxCoins, coins1 + coins2);
                    }
                }
            }
        }

        System.out.println(maxCoins);
    }

    public static int countCoins(int[][] grid, int x1, int y1, int x2, int y2) {
        int coins = 0;
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                coins += grid[i][j];
            }
        }
        return coins;
    }
}