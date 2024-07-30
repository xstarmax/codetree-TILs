import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\."); //.을 구분자로 쓸 때는 이스케이프-- \\ 필요
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        System.out.printf("%d-%d-%d",m,d,y);
    }
}