import java.util.Scanner;

public class Main {
    public static boolean inRange(int x, int y, int n, int m) {
        return (0 <= x && x < n && 0 <= y && y < m);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] answer = new int[n][m];

        int[] dx = {0, 1, 0, -1}; // 동, 남, 서, 북
        int[] dy = {1, 0, -1, 0};

        int x = 0, y = 0;
        int dirNum = 0;

        // 처음 시작 위치에 초기값을 적습니다.
        answer[x][y] = 1;
        
        // n*m번 진행합니다.
        for (int i = 2; i <= n * m; i++) {
            // 현재 방향 dir를 기준으로 그 다음 위치 값을 계산합니다.
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];

            // 더 이상 나아갈 수 없다면
            // 시계방향으로 90'를 회전합니다.
            if (!inRange(nx, ny, n, m) || answer[nx][ny] != 0) {
                dirNum = (dirNum + 1) % 4;
                nx = x + dx[dirNum]; // 새로운 방향으로 위치 재계산
                ny = y + dy[dirNum];
            }

            // 그 다음 위치로 이동한 다음 배열에 올바른 값을 채워넣습니다.
            x = nx;
            y = ny;
            answer[x][y] = i;
        }
        
        // 출력:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(answer[i][j] + " ");
            System.out.println();
        }
    }
}