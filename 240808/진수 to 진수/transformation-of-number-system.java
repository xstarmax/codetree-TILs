import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 처리
        int a = sc.nextInt();
        int b = sc.nextInt(); // n을 b진수로
        String n = sc.next(); // a진수로 표현된 어떤 수 n

        // 각 자리마다 a제곱해서 더해주기..
        int digits = 0; //2 -> 0.1
        for (int i=n.length()-1; i>=0; i--) {
            int num = Character.getNumericValue(n.charAt(i));
            digits += num * Math.pow(a, n.length()-1-i);
        }
        
        // 10진수가 된 digits -> b진수로
        int[] arr = new int[100];
        int cnt=0;
        while (digits > 0) {
            arr[cnt] = digits % b;
            cnt++;
            digits = digits / b;
        }
        for (int i=cnt-1; i>=0; i--) {
            System.out.print(arr[i]);
        }
    }
}