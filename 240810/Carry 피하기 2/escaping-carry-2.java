import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int maxSum = -1;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (noCarry(arr[i], arr[j], arr[k])) {
                        int sum = arr[i] + arr[j] + arr[k];
                        if (sum > maxSum) {
                            maxSum = sum;
                        }
                    }
                }
            }
        }
        System.out.println(maxSum);
    }

    public static boolean noCarry(int a, int b, int c) {
        while (a > 0 || b > 0 || c > 0) {
            int da = a % 10;
            int db = b % 10;
            int dc = c % 10;
            if (da + db + dc >= 10) {
                return false;
            }
            a /= 10;
            b /= 10;
            c /= 10;
        }
        return true;
    }
}