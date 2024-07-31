import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 빈 배열 초기화
        int[] arr = new int[50];
        
        // 0번 1번 초기화
        arr[0] = 1;
        arr[1] = sc.nextInt();

        // 출력 + 100 넘기면 중단
        System.out.printf("%d %d ", arr[0], arr[1]);
        for (int i=2; i<50; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            System.out.printf("%d ", arr[i]);
            if (arr[i] >= 100)
                break;
        }
    }
}