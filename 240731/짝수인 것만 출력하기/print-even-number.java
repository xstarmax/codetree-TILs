import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 원소의 개수 입력 -> 저장 배열 선언
        int num = sc.nextInt();
        int[] arr = new int[num];
        
        // 
        for (int i=0; i<num; i++) {
            int val = sc.nextInt();
            if (val % 2 == 0)
                arr[i] = val;
            else
                arr[i] = -1;
        }

        for (int i=0; i<num; i++) {
            if (arr[i] != -1)
                System.out.printf("%d ", arr[i]);
        }
        
    }
}