import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 학생수 num
        int num = sc.nextInt();

        // 점수 배열 입력
        int arr[][] = new int[num][4];
        for (int i=0; i<num; i++) {
             for (int j=0; j<4; j++) {
                arr[i][j] = sc.nextInt();        
             }
        }

        // 학생 마다 n/p 검사
        int cnt = 0;
        for (int i=0; i<num; i++) {
            int sum = 0;
             for (int j=0; j<4; j++) {
                sum += arr[i][j];
             }
             double avg = (double)sum/4;
             if (avg >= 60){
                System.out.println("pass");
                cnt++;
             } else {
                System.out.println("fail");
             }
        }
        
        // 최종 pass 인원
        System.out.println(cnt);
    }
}