import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[11]; // 10번째 항을 위해 11번째까지 만듦

        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        
        for (int i=0; i<9; i++) { 
            arr[i+2] = arr[i] + arr[i+1];
            System.out.printf("%d ", arr[i] % 10);
        }
        System.out.printf("%d ", arr[9] % 10);
    }
}