import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        for (int i=0; i<size; i++)
            arr[i] = sc.nextInt();
        
        Arrays.sort(arr);
        for (int i=0; i<size; i++)
            System.out.printf("%d ", arr[i]);

        System.out.print("\n");
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());
        for (int i=0; i<size; i++)
            System.out.printf("%d ", arr2[i]);
    }
}