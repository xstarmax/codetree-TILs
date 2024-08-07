import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 처리    
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        // 날짜수 계산
        int[] days = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};

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

        // 만약 12월 23일 12월 23일 이면... 0
        String[] str = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int ans = (diff % 7);
        if (ans < 0)
            ans = 7 + ans;
        
        System.out.print(str[ans]);     
    
    }
}