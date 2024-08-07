import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 윤년 제외
        int[] dbm = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        
        // 입력 처리
        int m1 = sc.nextInt(); // 11
        int d1 = sc.nextInt(); // 5
        int m2 = sc.nextInt(); // 12
        int d2 = sc.nextInt(); // 21

        int pre = 0, aft = 0;
        for (int i=0; i<m1; i++) {
            pre += dbm[i];
        }
        pre += d1;

        for (int i=0; i<m2; i++) {
            aft += dbm[i];
        }
        aft += d2;

        // 출력 처리
        System.out.print(aft - pre + 1);
    }
}