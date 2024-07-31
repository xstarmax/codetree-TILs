import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 짜기
        int[][] arr = new int[4][4];
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        // 합 구하기
        int sum=0;
        for (int i=0; i<4; i++) {
            for (int j=0; j<i+1; j++) {
                sum += arr[i][j];
            }
        }
        System.out.print(sum);
    }
}