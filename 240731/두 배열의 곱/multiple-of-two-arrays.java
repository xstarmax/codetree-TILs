import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];

        // 입력 받아서 배열 짜기
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        // 출력할 배열 짜고 출력
        int[][] arr3 = new int[3][3];
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                arr3[i][j] = arr1[i][j] * arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}