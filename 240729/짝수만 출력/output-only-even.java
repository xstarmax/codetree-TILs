import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();

        int i = a;

        while (i<b+1) {
            if (i%2 == 0)
                System.out.print(i + " ");
            i++;
        }

    }
}