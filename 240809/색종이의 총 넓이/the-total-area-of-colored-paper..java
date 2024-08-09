import java.util.Scanner;

public class Main {
    public static int MAX_SIZE = 200;
    public static int OFFSET = 100;
    public static int[][] arr = new int[MAX_SIZE][MAX_SIZE];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 처리
        int num = sc.nextInt();
        int x, y;
        for (int i=0; i<num; i++) {
            x = sc.nextInt();
            y = sc.nextInt();

            x += OFFSET;
            y += OFFSET;

            for (int k=x; k<x+8; k++) {
                for (int j=y; j<y+8; j++) {
                    if (arr[k][j] < 1)
                        arr[k][j] += 1;
                }
            }
        }
        
        // 출력 처리
        int cnt = 0;
        for (int i=0; i<MAX_SIZE; i++) {
            for (int j=0; j<MAX_SIZE; j++) {
                if (arr[i][j] == 1)
                    cnt++;
            }
        }
        System.out.print(cnt);
    }
}