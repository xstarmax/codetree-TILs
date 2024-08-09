import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 처리
        int size = sc.nextInt(); // 3
        int[][] arr = new int[size][size];

        int command_num = sc.nextInt(); // 8
        String command = sc.next();

        char[] carr = new char[command_num];
        for (int i=0; i<command_num; i++) {
            carr[i] = command.charAt(i);
        }

        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 커맨드 대로 이동
        // 북동남서
        int[] dx = new int[]{-1,0,1,0};
        int[] dy = new int[]{0,1,0,-1};

        // 현재 위치 arr[x][y]
        int x = (size-1)/2; // 1
        int y = (size-1)/2; // 1
        
        // 현재 방향 dx[0] dy[0]
        int dir = 0; // 북
        int ans = arr[x][y]; // 현재 중앙값으로 초기화
        
        for (int i=0; i<command_num; i++) {
            if (carr[i] == 'R') {
                dir = (dir+1) % 4;
            } else if (carr[i] == 'L') {
                dir = (dir-1 + 4) % 4;
            } else if (carr[i] == 'F') {
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                if (nx >= 0 && nx < size && ny >=0 && ny < size) {
                    x = nx;
                    y = ny;
                    ans += arr[x][y];
                }
            }
        }
        System.out.print(ans);
    }
}