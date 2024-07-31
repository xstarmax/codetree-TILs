import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        // 최댓값 찾기
        int max = -1; // -1으로 기본 초기화
        for (int i=0; i<size; i++) {
            int currNum = arr[i];
            if (max < arr[i]) {
                int count = 0;
                for (int j = 0; j < size; j++) {
                    if (arr[j] == currNum)
                        count++;
                }
                if (count == 1) {
                    max = currNum;
                }
            }
        }

        System.out.print(max);
    }
}