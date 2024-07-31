import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        for (int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        int a,b;
        int min = Integer.MAX_VALUE;

        for (int i=0; i<size-1; i++) {
            a = arr[i];
            b = arr[i+1];
            if (b-a < min) 
                min = b-a;
        }
        System.out.print(min);
    }
}