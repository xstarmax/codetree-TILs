import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int cnt=0;

        for (int i=0; i<10; i++) {
            int val = sc.nextInt();
            if (val == 0) {
                break;
            } else {
                arr[i] = val;
                cnt++;
            }
        }
        for (int i=cnt-1; i>=0; i--) { // cnt-1 부터 시작해야함..
            System.out.printf("%d ",arr[i]);
        }
    }
}