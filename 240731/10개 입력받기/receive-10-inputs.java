import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int cnt=0, sum=0;

        for (int i=0; i<10; i++) {
            int val = sc.nextInt();
            if (val == 0) {
                break;
            } else {
                arr[i] = val;
                sum += arr[i];
                cnt++;
            }
        }
        System.out.printf("%d %.1f", sum, (double)sum/cnt);
    }
}