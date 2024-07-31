import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 만들기
        int[] arr = new int[10];
        for (int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
        }

        // max (500) min
        int max=1, min=1000;
        for (int i=0; i<10; i++) {
            if (arr[i] < 500 && arr[i] > max)
                max = arr[i];
            else if (arr[i] > 500 && arr[i] < min)
                min = arr[i];
        }
        System.out.print(max + " " + min);
    }
}