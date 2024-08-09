import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();

        int x = 0, y = 0;
        int dir = 0;
        int time = 0;
        int minTime = Integer.MAX_VALUE;

        int[] dx = {0, 1, 0, -1}; // 동,남,서,북
        int[] dy = {1, 0, -1, 0};

        for (char command : commands.toCharArray()) {
            if (command == 'L') {
                dir = (dir + 3) % 4; // turn left
                time++;
            } else if (command == 'R') {
                dir = (dir + 1) % 4; // turn right
                time++;
            } else if (command == 'F') {
                x += dx[dir];
                y += dy[dir];
                time++;

                if (x == 0 && y == 0) {
                    minTime = Math.min(minTime, time);
                }
            }
        }

        if (minTime == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(minTime);
        }
    }
}