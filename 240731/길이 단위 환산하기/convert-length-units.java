import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double ft = 30.48;
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        System.out.printf("%.1f",a*ft);
    }
}