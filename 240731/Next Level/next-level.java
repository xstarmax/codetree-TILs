import java.util.Scanner;

class User {
    String id;
    int level;

    public User() {
        this.id = "codetree";
        this.level = 10;
    }

    public User(String id, int level) {
        this.id = id;
        this.level = level;
    }
}

public class Main {
    public static void main(String[] args) {
        // 입력 받기
        Scanner sc = new Scanner(System.in);
        String sId = sc.next();
        int level = sc.nextInt();

        User user1 = new User();
        User user2 = new User(sId, level);

        System.out.printf("user %s lv %d\n", user1.id, user1.level);
        System.out.printf("user %s lv %d\n", user2.id, user2.level);
    }
}