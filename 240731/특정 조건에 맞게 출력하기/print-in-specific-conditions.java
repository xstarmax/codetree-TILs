import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int cnt = 0;

        for (int i=0; i<100; i++) {
            int val = sc.nextInt();
            if (val == 0) {
                break;
            } else {
                arr[i] = val;
                cnt++;
            }
        }

        for (int i=0; i<cnt; i++) {
            if (arr[i] %2 == 0) {
                System.out.printf("%d ", arr[i]/2);
            } else {
                System.out.printf("%d ", arr[i]+3);
            }
        }
    }
}