import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 초기 배열 2개 입력 받기
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        // 새로운 배열 만들기
        int[][] arr3 = new int[n][m];

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (arr1[i][j] == arr2[i][j])
                    arr3[i][j] = 0;
                else
                    arr3[i][j] = 1;
            }
        }

        // 최종 출력
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}