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

        // m1-d1 까지의 날짜수
        int i=0;
        int prev = 0;
        int aft = 0;

        while (true) {
            if (i == m1-1)
                break;
            prev += dbm[i];
            i++;
        }
        prev += d1;

        // m2-d2 까지의 날짜수
        i=0;
        while (true) {
            if (i == m2-1)
                break;
            aft += dbm[i];
            i++;
        }
        aft += d2;
        
        System.out.print(aft - prev);
    }
}