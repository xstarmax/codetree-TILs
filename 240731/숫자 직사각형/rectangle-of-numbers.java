import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 초기화
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        
        // 숫자 넣어서 짜기
        int num = 1;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                arr[i][j] = num;
                num++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}