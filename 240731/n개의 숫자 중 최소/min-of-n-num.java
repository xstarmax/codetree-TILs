import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력값 저장해둘 배열
        int size = sc.nextInt();
        int[] arr = new int[size];

        // min값 넣을 변수
        int minVal = Integer.MAX_VALUE;
        
        // 입력과 동시에 minVal 갱신
        for (int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < minVal)
                minVal = arr[i];
        }

        // min에 해당하는 원소 개수 검사
        int cnt = 0;
        for (int i=0; i<size; i++) {
            if (arr[i] == minVal)
                cnt++;
        }

        // 최종 min 출력, min에 해당하는 원소 개수 출력
        System.out.printf("%d %d", minVal, cnt);
    }
}