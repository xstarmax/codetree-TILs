import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 좌표 초기화
        int x=0, y=0;
        
        // 방향 정보 숫자화, 북동남서
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};

        // 입력 처리
        int size = sc.nextInt();
        for (int i=0; i<size; i++) {
            char st = sc.next().charAt(0);
            int dist = sc.nextInt();
            int mul; 

            if (st == 'N')
                mul = 0;
            else if (st == 'E')
                mul = 1;
            else if (st =='S')
                mul = 2;
            else 
                mul = 3;

            x += dist*dx[mul];
            y += dist*dy[mul];
        }

        // 출력 처리
        System.out.print(x + " " + y);
    }
}