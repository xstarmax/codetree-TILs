import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    String n;
    int k,e,m;
    
    public Student (String name, int kor, int eng, int math) {
        this.n = name;
        this.k = kor;
        this.e = eng;
        this.m = math;
    }

    @Override
    public int compareTo(Student student) {
        // 우선순위: 국어, 영어, 수학 -- 내림차순
        if (this.k != student.k) {
            return student.k - this.k;
        } else if (this.e != student.e) {
            return student.e - this.e;
        } else {
            return student.m - this.m;
        }
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받아서 리스트 짜기
        int size = sc.nextInt();
        Student[] student = new Student[size];
        for (int i=0; i<size; i++) {
            String sname = sc.next();
            int skor = sc.nextInt();
            int seng = sc.nextInt();
            int smath = sc.nextInt();
            student[i] = new Student(sname, skor, seng, smath);
        }

        Arrays.sort(student);
        
        for (int i=0; i<size; i++) {
            System.out.print(student[i].n + " ");
            System.out.print(student[i].k + " ");
            System.out.print(student[i].e + " ");
            System.out.print(student[i].m + " ");
            System.out.print("\n");
        }
    }
}