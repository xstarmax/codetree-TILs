import java.util.Scanner;

public class Main {
    public static int MAX_SIZE = 200;
    public static int OFFSET = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 처리
        int size = sc.nextInt(); // 2
        char[][] arr = new char[MAX_SIZE][MAX_SIZE];

        // color => 0: 빨간색 1: 파란색
        int x1, y1, x2, y2;
        for (int i=0; i<size; i++) {
            x1 = sc.nextInt() + OFFSET;
            y1 = sc.nextInt() + OFFSET;
            x2 = sc.nextInt() + OFFSET;
            y2 = sc.nextInt() + OFFSET;

            for (int j=x1; j<x2; j++) {
                for (int k=y1; k<y2; k++) {
                    if (i % 2 == 0) {
                        arr[j][k] = 'R';
                    } else {
                        arr[j][k] = 'B';
                    }
                }
            }
        }

        int cnt = 0;
        for (int i=0; i<MAX_SIZE; i++) {
            for (int j=0; j<MAX_SIZE; j++) {
                if (arr[i][j] == 'B')
                    cnt++;
            }
        }
        System.out.print(cnt);
    }
}