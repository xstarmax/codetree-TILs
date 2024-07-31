import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt(); // 입력받을 개수
        int[] arr = new int[cnt]; // 최대 입력 개수만큼 짝수 저장 배열

        for (int i=0; i<cnt; i++) {
            int val = sc.nextInt();
            if (val %2 == 0) {
                arr[i] = val;
            } else {
                arr[i] = -1;
            }
        }
        for (int i=cnt-1; i>=0; i--) {
            if (arr[i] != -1)
                System.out.printf("%d ",arr[i]);
        }
    }
}