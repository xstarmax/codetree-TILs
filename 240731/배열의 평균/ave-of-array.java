import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 초기 배열 짜기
        int[][] arr = new int[2][4];
        for (int i=0; i<2; i++) {
            for (int j=0; j<4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 가로 평균
        for (int i=0; i<2; i++) {
            double sum = 0;
            for (int j=0; j<4; j++) {
                sum += arr[i][j];
            }
            double avg = sum / 4;
            System.out.printf("%.1f ", avg);
        }
        System.out.print("\n");

        // 세로 평균
        for (int j=0; j<4; j++) {
            double sum = 0;
            for (int i=0; i<2; i++) {
                sum += arr[i][j];
            }
            double avg = sum / 2;
            System.out.printf("%.1f ", avg);
        }
        System.out.print("\n");
        
        // 전체 평균
        double sum = 0;
        for (int i=0; i<2; i++) {
            for (int j=0; j<4; j++) {
                sum += arr[i][j];
            }
        }
        double avg = sum / 8;
        System.out.printf("%.1f",avg);
    }
}