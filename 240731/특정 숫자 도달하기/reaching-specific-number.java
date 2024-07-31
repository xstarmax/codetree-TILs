import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum=0, count = 0;

        for (int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
        } // 입력은 일단 끝까지 받아야함

        for (int i=0; i<10; i++) {
            if (arr[i] >= 250)
                break;
            sum += arr[i];
            count++;
        }
        double avg = (double)sum/count;

        System.out.printf("%d %.1f",sum,avg);
    }
}