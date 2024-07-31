import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력값 저장해둘 배열
        int[] arr = new int[10];

        // max값 넣을 변수
        int maxVal = Integer.MIN_VALUE;
        
        // 입력과 동시에 max 갱신
        for (int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > maxVal)
                maxVal = arr[i];
        }

        // 최종 max 출력
        System.out.printf("%d", maxVal);
    }
}