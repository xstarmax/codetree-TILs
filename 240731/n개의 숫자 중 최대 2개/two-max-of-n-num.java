import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력될 size 초기화
        int size = sc.nextInt();

        // 배열 채우기
        int[] arr = new int[size];
        for (int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        
        // max1, max2 찾기
        int max1, max2;
        if (arr[0] > arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        } else {
            max1 = arr[1];
            max2 = arr[2];
        }

        // 3번째부터 끝까지보면서 max1, max2값 갱신
        for (int i=2; i<size; i++) {
            if (arr[i] >= max1) {
                max2 = max1;
                max1 = arr[i];
            }
            else if (arr[i] > max2 ) {
                max2 = arr[i];
            }
        }

        // 최종 출력
        System.out.printf("%d %d ", max1, max2);
    }
}