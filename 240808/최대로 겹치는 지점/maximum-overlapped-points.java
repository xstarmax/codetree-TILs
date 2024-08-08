import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 처리
        int size = sc.nextInt(); // 커맨드 개수 3

        int[] arr = new int[105]; // 색칠할 배열 크기 105

        for (int i=0; i<size; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            
            for (int j=x1; j<=x2; j++) {
                arr[j] += 1;
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i=0; i<105; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.print(max);
    }
}