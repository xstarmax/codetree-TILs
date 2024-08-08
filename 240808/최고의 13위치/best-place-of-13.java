import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 처리 + 격자 만들기
        int n = sc.nextInt();        // 3
        int[][] arr = new int[n][n]; // 3 x 3

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        // 격자 돌리기
        int maxCnt = 0;
        for (int i=0; i<n; i++) {     // 0 1 2
            for (int j=0; j<n-2; j++) {  // 0
                maxCnt = Math.max(maxCnt, arr[i][j] + arr[i][j+1] + arr[i][j+2]);
            }
        }        
        System.out.println(maxCnt);
    }
}