import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫번째 입력에서 maxVal, minVal을 초기화
        int maxVal, minVal;
        maxVal = minVal = sc.nextInt();

        // 두번째 입력부터 minVal, maxVal 초기화
        for (int i=0; i<100; i++) {
            int val = sc.nextInt();
            if (val == 999 || val == -999) {
                break;
            } else {
                if (val > maxVal) {
                    maxVal = val;
                }
                else if (val < minVal) {
                    minVal = val;
                }
            }

        }

        // 최종 출력
        System.out.printf("%d %d", maxVal, minVal);
    }
}