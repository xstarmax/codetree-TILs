import java.util.Scanner;

class Spy {
    String secretCode;
    char meetingPoint;
    int time;

    public Spy(String secretCode, char meetingPoint, int time) {
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        String sCode = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();

        // Spy 객체 만들기
        Spy sp = new Spy(sCode, mPoint, time);

        // 객체 속성 출력
        System.out.println("secret code : " + sp.secretCode);
        System.out.println("meeting point : " + sp.meetingPoint);
        System.out.println("time : " + sp.time);
    }
}