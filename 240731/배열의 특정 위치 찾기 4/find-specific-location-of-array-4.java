import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int val, sum=0, cnt=0;

        for (int i=0; i<10; i++) {
            val = sc.nextInt();
            if (val == 0) {
                break;
            } else {
                if (val % 2 == 0) {
                    cnt++;
                    sum += val;
                }
            }
        }
        System.out.printf("%d %d", cnt, sum);
    }
}