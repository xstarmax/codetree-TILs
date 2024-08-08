import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 처리
        String n = sc.next();

        // 10진수로 바꾸기
        int digits = 0;
        for (int i = n.length() - 1; i >= 0; i--) {
            // 현재 자리수의 값 (문자를 정수로 변환)
            int bit = Character.getNumericValue(n.charAt(i));
            // 2의 거듭제곱과 곱하여 더하기
            digits += bit * Math.pow(2, n.length() - 1 - i);
        }


        // 10진수 값 * 17
        digits *= 17;

        // 2진수로 다시 변환
        int[] arr = new int[100];
        int cnt = 0;

        while (digits > 0) {
            arr[cnt] = digits % 2;
            cnt++;
            digits /= 2;
        }

        for (int i=cnt-1; i>=0; i--) {
            System.out.print(arr[i]);
        }
    }
}