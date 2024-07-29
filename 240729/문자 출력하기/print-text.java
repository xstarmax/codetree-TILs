import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        // char c = sc.next().charAt(0);
        
        int i = 1;
        while (i < 9) {
            System.out.print(a);
            i++;
        }
    }
}