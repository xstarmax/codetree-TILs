import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 처리
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        // 거리 계산
        int minSum = Integer.MAX_VALUE;
        for (int i=0; i<size; i++) {
            int sumCache = 0;
            for (int j=0; j<size; j++) {
                sumCache += Math.abs(i-j) * arr[j];
            }
            if (minSum > sumCache)
                minSum = sumCache;
        }
        System.out.print(minSum);
    }
}

// 후보를 만드는 for문 => 회의를 주체하는 경우 n가지

/* 
완전탐색: 고려해야하는 모든 후보들에 대해 다 해본다.
후보 => 가짓수
해본다 => 계산, 탐색수 (문제에서 원하는 바)

*/