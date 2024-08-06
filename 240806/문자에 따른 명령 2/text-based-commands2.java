import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 현재 위치 (북)
        int x = 0, y = 0;

        // dx, dy 북, 동, 남, 서
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        
        // 현재 방향 (0: 북)
        int direction = 0;

        // 입력
        String com = sc.next();
        
        // 처리
        for (int i = 0; i < com.length(); i++) {
            char st = com.charAt(i);

            if (st == 'L') {
                direction = (direction - 1 + 4) % 4; // 왼쪽으로 회전
            } else if (st == 'R') {
                direction = (direction + 1) % 4; // 오른쪽으로 회전
            } else { // 'M'일 경우
                x += dx[direction]; // 현재 방향으로 이동
                y += dy[direction];
            }
        }
        
        // 최종 위치 출력
        System.out.print(x + " " + y);
    }
}