import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    int h, w, n;
    
    public Student (int height, int weight, int number) {
        this.h = height;
        this.w = weight;
        this.n = number;
    }
    
    @Override
    public int compareTo(Student std) {
        // 내림차순 키 > 몸무게 > 번호
        if (this.h != std.h) {
            return std.h - this.h; // 키 내림차순
        } else if (this.w != std.w) {
            return std.w - this.w; // 몸무게 내림차순
        } else {
            return this.n - std.n; // 번호 오름차순
        }
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        Student[] std = new Student[size];
        for (int i=0; i<size; i++) {
            int hei = sc.nextInt();
            int wei = sc.nextInt();
            int num = i+1;

            std[i] = new Student(hei,wei,num);
        }

        Arrays.sort(std);

        for (int i=0; i<size; i++) {
            System.out.print(std[i].h+ " ");
            System.out.print(std[i].w + " ");
            System.out.print(std[i].n + " ");
            System.out.print("\n");
        }
    }
}