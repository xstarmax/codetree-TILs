import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // 저장해둘 배열
        int[] arr = new int[num];

        // 입력
        for (int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
            arr[i] = arr[i]*arr[i];
        }

        //출력
        for (int i=0; i<num; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}