import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 과목수 sub
        int sub = sc.nextInt();

        // 각 과목 학점
        double[] arr = new double[sub];
        double sum = 0;
        for (int i=0;i<sub;i++) {
            arr[i] += sc.nextDouble();
            sum += arr[i];
        }

        // 평균학점 구하기
        double avg = sum/sub;
        System.out.printf("%.1f\n", avg);

        // 등급 출력
        if (avg >= 4.0)
            System.out.print("Perfect");
        else if (avg >= 3.0)
            System.out.print("Good");
        else
            System.out.print("Poor");
        
    }
}