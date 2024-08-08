import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        for (int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        int ans =0;
        for (int i=0; i<size; i++) {
            for (int j=i+1; j<size; j++) {
                for (int k=j+1; k<size; k++) {
                    if (arr[i] <= arr[j] && arr[j] <= arr[k])
                    ans++;
                }
            }
        }
        System.out.print(ans);
    }
}

// 가짓수 nC3
// 계산  : 1
// 시간 복잡도 -> O(n3)