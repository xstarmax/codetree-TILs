import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;

        for (int i=0; i<100; i++) {
            int val = sc.nextInt();
            if (val == 999 || val == -999)
                break;
            else {
                if (val > maxVal)
                    maxVal = val;
                else if (val < minVal)
                    minVal = val;
            }
        }
        System.out.printf("%d %d", maxVal, minVal);
    }
}