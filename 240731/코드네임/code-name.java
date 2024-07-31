import java.util.Scanner;

class Agent {
    char code;
    int score;

    public Agent(char code, int score) {
        this.code  = code;
        this.score = score;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 5명 명단 짜기
        Agent[] agents = new Agent[5];
        for (int i=0; i<5; i++) {
            char mcode = sc.next().charAt(0);
            int mscore = sc.nextInt();

            agents[i] = new Agent(mcode, mscore);
        }

        // 점수가 제일 낮은 요원 찾기
        int min = Integer.MAX_VALUE;
        for (int i=0; i<5; i++) {
            if (agents[i].score < min )
                min = agents[i].score;
        }
        
        for (int i=0; i<5; i++) {
            if (agents[i].score == min) {
                System.out.print(agents[i].code + " ");
                System.out.print(agents[i].score);
            }       
        }
    }
}