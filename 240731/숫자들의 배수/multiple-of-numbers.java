import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력 숫자 n
        int n = sc.nextInt();
        
        // n의 배수 반복 출력, 5의 배수가 2번 출력되면 종료
        int cnt = 0;
        int[] arr = new int[100];
        for (int i=1; i<100; i++) {
            arr[i] = n * i;
            System.out.printf("%d ", arr[i]);

            if (arr[i] % 5 == 0) {
                cnt++;
            }

            if (cnt == 2) {
                break;
            }
        }
    }
}