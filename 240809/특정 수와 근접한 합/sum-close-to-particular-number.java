import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 처리
        int size = sc.nextInt(); // 6
        int tar = sc.nextInt(); // 20

        int[] arr = new int[size];
        int sum=0;
        for (int i=0; i<size; i++) {
            arr[i] = sc.nextInt();  // 5 7 9 1 13 8
            sum += arr[i];
        }

        
        // 
        int minDiff = Integer.MAX_VALUE;
        for (int i=0; i<size-1; i++) {
            for (int j=i+1; j<size; j++) {
                int minSum = sum - (arr[i] + arr[j]);
                int diff = Math.abs(tar - minSum);
                if (diff < minDiff) {
                    minDiff = diff;
                }
            }
        }
        System.out.print(minDiff);
    }
}