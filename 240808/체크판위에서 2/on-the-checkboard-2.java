import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 처리
        int r = sc.nextInt();
        int c = sc.nextInt();
        char[][] arr = new char[r][c];

        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }

        // st = a[0][0]
        // ed = a[r-1][c=1]
        int cnt=0;
        for (int i=1; i<r-2; i++) { // 사실상 3번째 for문을 돌면서부터 r-1에 걸리기 때문에 i<r로 두어도 무방
            for (int j=1; j<c-2; j++) {
                    for (int oi=i+1; oi<r-1; oi++) {
                        for (int oj=j+1; oj<c-1; oj++) {
                            // 색이 계속 달라지는 경우에만 개수를 세줌
                            if (arr[0][0] != arr[i][j] &&
                                arr[i][j] != arr[oi][oj] &&
                                arr[oi][oj] != arr[r-1][c-1])
                                cnt++;
                        }
                    }
                }
            }
        System.out.print(cnt);
    }
}

/* 
1번째 칸 후보 (r-1)x(c-1) -> (i.j)
2번째 칸 후보 (r-i-2) x (c-j-2)
*/