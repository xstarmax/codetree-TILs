import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 배열 만들기
        int[] arr = new int[210]; // (-105 ~ 105)로 범위 잡음
        int size = sc.nextInt();
        int cur = 100; // 현재 위치

        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();
            char dir = sc.next().charAt(0);

            if (dir == 'R') {
                // 오른쪽으로 이동
                for (int j = cur; j < cur + num; j++) {
                    arr[j] += 1; // 방문 카운트 증가
                }
                cur += num; // 현재 위치 업데이트
            } else if (dir == 'L') {
                // 왼쪽으로 이동
                for (int j = cur; j > cur - num; j--) {
                    arr[j] += 1; // 방문 카운트 증가
                }
                cur -= num; // 현재 위치 업데이트
            }
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) {
                cnt++; // 두 번 이상 방문한 위치 카운트
            }
        }
        System.out.print(cnt);
    }
}