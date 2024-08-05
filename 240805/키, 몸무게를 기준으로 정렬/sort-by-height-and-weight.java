import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    String n;
    int h, w;

    public Student (String name, int height, int weight) {
        this.n = name;
        this.h = height;
        this.w = weight;
    }

    @Override
    public int compareTo(Student o) {
        // 키를 기준으로 오름차순 정렬
        if (this.h != o.h) {
            return Integer.compare(this.h, o.h); // 키가 다르면 오름차순 정렬
        } else {
            // 키가 동일할 경우 몸무게를 기준으로 내림차순 정렬
            return Integer.compare(o.w, this.w); // 몸무게가 더 큰 사람이 먼저 나오도록
        }
    }

    public String print() {
        return n + " " + h + " " + w;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        Student[] student = new Student[size];
        for (int i=0; i<size; i++) {
            String a1 = sc.next();
            int a2 = sc.nextInt();
            int a3 = sc.nextInt();
            
            student[i] = new Student(a1,a2,a3);
        }

        Arrays.sort(student);

        for (int i=0; i<size; i++) {
            System.out.print(student[i].print());
            System.out.println();
        }
    }
}