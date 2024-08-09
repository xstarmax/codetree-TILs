import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(maxSum(arr));
    }

    public static int maxSum(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 2; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}