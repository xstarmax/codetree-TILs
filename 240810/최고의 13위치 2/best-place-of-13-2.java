import java.util.Scanner;

public class Main {
    public static final int MAX_N = 20;

    public static int n;
    public static int[][] grid = new int[MAX_N][MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int maxCoins = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 2; j++) {
                int coins = countCoins(i, j);
                maxCoins = Math.max(maxCoins, coins);
            }
        }

        System.out.println(maxCoins);
    }

    public static int countCoins(int x, int y) {
        int coins = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                coins += grid[x + i][y + j];
            }
        }
        return coins;
    }
}