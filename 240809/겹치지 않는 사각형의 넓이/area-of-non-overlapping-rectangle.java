import java.util.Scanner;

public class Main {
    public static int MAX_SIZE = 2000;
    public static int OFFSET = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] dig = new int[MAX_SIZE][MAX_SIZE];

        // 입력 처리 (A, B만)
        int x1,y1,x2,y2;
        for (int i=0; i<2; i++) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();

            x1 += OFFSET;
            y1 += OFFSET;
            x2 += OFFSET;
            y2 += OFFSET;

            for (int j=x1; j<x2; j++) {
                for (int k=y1; k<y2; k++) {
                    dig[j][k] += 1;
                }
            }
        }

        // M 입력을 따로 처리
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        x1 += OFFSET;
        y1 += OFFSET;
        x2 += OFFSET;
        y2 += OFFSET;

        for (int j=x1; j<x2; j++) {
            for (int k=y1; k<y2; k++) {
                 dig[j][k] = -1;
            }
        }

        int cnt = 0;
        for (int i=0; i<MAX_SIZE; i++) {
            for (int j=0; j<MAX_SIZE; j++) {
                if (dig[i][j] == 1)
                    cnt++;
            }
        }
        System.out.print(cnt);
    }
}