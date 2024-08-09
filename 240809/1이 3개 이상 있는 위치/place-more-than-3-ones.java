import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int[][] arr = new int[size][size];
        
        // 입력 처리
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 계산: 상하좌우 dx dy        
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        
        int cnt = 0;  // 카운트 변수 초기화
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int oneCount = 0;  // 인접한 1의 수 초기화
                for (int dir = 0; dir < 4; dir++) {
                    int di = i + dx[dir];
                    int dj = j + dy[dir];
                    // 인접한 칸이 격자 내에 있는지 확인
                    if (di >= 0 && di < size && dj >= 0 && dj < size) {
                        if (arr[di][dj] == 1) {
                            oneCount++;
                        }
                    }
                }
                // 인접한 1의 수가 3개 이상인 경우 카운트
                if (oneCount >= 3) {
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}