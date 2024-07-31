import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    String n;
    int s1,s2,s3;

    public Student (String name, int s1, int s2, int s3) {
        this.n = name;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public int compareTo(Student std) {
        return (this.s1 + this.s2 + this.s3) - (std.s1 + std.s2 + std.s3);
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Student[] std = new Student[size];
        
        for (int i=0; i<size; i++) {
            String sname = sc.next();
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            int s3 = sc.nextInt();

            std[i] = new Student(sname, s1, s2, s3);
        }

        Arrays.sort(std);

        for (int i=0; i<size; i++) {
            System.out.print(std[i].n + " ");
            System.out.print(std[i].s1 + " ");
            System.out.print(std[i].s2 + " ");
            System.out.print(std[i].s3 + " ");
            System.out.print("\n");
        }
    }
}