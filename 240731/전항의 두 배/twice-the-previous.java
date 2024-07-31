import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 배열 초기화
        int[] arr = new int[10];

        // 1번, 2번 항 입력
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();

        // 인덱스 0부터 9까지 출력
        System.out.printf("%d %d ",arr[0], arr[1]);

        for (int i=2; i<10; i++) {
            arr[i] = arr[i-1] + (2*arr[i-2]);
            System.out.printf("%d ", arr[i]);
        }
    }
}