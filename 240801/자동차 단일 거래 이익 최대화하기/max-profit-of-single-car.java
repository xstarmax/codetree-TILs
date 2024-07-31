import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n년 + 가격 정보 -> 배열
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        // 0번부터 size-1번까지 사는 케이스 가능
        // 1번부터 size까지 파는 케이스 가능
        int index = 0;
        int profit = 0;
        for (int i=index; i<size-1; i++) {
            int buy = arr[i]; // 9,10,2,3
            for (int j=index+1; j<size; j++) {
                int sell = arr[j];
                if (sell - buy > profit)
                    profit = sell - buy;
            }
            if (index == size-1) {
                break;
            } else {
                index++;
            }
        }
        System.out.print(profit);
        
    }
}