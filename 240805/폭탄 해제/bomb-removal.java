import java.util.Scanner;

class BombClear {
    String code;
    char color;
    int sec;

    public BombClear(String code, char color, int sec) {
        this.code = code;
        this.color = color;
        this.sec = sec;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        int i = sc.nextInt();

        BombClear bomb1 = new BombClear(s,c,i);
        System.out.printf("code : %s\n", bomb1.code);
        System.out.printf("color : %c\n", bomb1.color);
        System.out.printf("second : %d\n", bomb1.sec);
    }
}