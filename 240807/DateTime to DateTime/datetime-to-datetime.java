import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 처리
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int diff = (a * 24 * 60 + b * 60 + c) - (11 * 24 * 60 + 11 * 60 + 11);
        
        // 출력
        if(diff < 0)
            System.out.print(-1);
        else
            System.out.print(diff);
    }
}