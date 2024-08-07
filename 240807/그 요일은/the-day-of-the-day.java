import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 처리    
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String tar = sc.next();

        // 날짜수 계산
        int[] days = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};

        int pre=0;
        for (int i=0; i<m1; i++)
            pre += days[i];
        pre += d1;

        int aft=0;
        for (int i=0; i<m2; i++)
            aft += days[i];
        aft += d2;

        // 차이 계산
        int diff = aft - pre;

        // 8월 12일부터 8월 31일까지, 목요일 diff = 23; ans = 3;
        String[] str = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int ans = (diff % 7);
        System.out.print(ans);
    }
}