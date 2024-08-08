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

        // 처음 위치는 (0,0)이라고 생각하고...
        int cnt=0;
        for (int i=1; i<r-2; i++) {
            for (int j=1; j<c-2; j++) {
                if (arr[i][j] != arr[0][0]) {
                    for (int oi=i+1; oi<r-1; oi++) {
                        for (int oj=j+1; oj<c-1; oj++) {
                            if (arr[oi][oj] != arr[i][j])
                                cnt++;
                        }
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