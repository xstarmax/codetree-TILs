import java.util.Scanner;

public class Main {
    public static int MAX_NUM = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 처리
        int num = sc.nextInt(); // 111
        int toWhat = sc.nextInt(); // 4

        // 진수 처리
        int[] arr = new int[MAX_NUM];
        int cnt = 0;

        while (num > 0) {
            arr[cnt] = num % toWhat;
            num = num / toWhat;
            cnt++;
        }
        
        // 출력 처리
        for (int i=cnt-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}