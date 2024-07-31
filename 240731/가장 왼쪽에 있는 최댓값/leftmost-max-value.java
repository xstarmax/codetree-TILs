import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 초기 배열 크기
        int size = sc.nextInt();
        
        // 원소 입력 -> 배열 완성
        int[] arr = new int[size];
        for (int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        // 첫번째 최댓값 찾기 (인덱스 위치)
        int max = -1;
        for (int i=0; i<size; i++) {
            if (arr[i] >= max)
                max = arr[i];
        }
        // 첫번째 최댓값의 인덱스 위치 찾기
        int loc = -1;
        for (int i=0; i<size; i++) {
            if (arr[i] == max) {
                loc = i;
                break; // 처음꺼 찾으면 더 탐색 안 함
            }
        }
        System.out.print(loc+1 + " ");

        // 두번째 최댓값 찾기
        max = -1;
        for (int i=loc; i>=0; i--) {
            // 최초의 최댓값 있던 자리에서부터 역순으로 탐색
            if (arr[i] >= max) {
                loc = i;
            }
        }
        System.out.print(loc+1);
    }
}