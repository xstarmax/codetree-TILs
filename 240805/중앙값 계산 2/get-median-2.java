import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 처리
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int temp = sc.nextInt();
            arr.add(temp);
            
            // 홀수 번째 원소일 때 중앙값 출력
            if (i % 2 == 0) {
                Collections.sort(arr); // 현재까지 입력된 숫자 정렬
                int mid = arr.size() / 2; // 중앙값 인덱스
                System.out.print(arr.get(mid) + " "); // 중앙값 출력
            }
        }
    }
}