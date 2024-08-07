import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    int h,w,x;

    public Student (int height, int weight, int index) {
        this.h = height;
        this.w = weight;
        this.x = index;
    }

    public int compareTo(Student o) {
        if (this.h != o.h)
            return this.h - o.h;
        else
            return o.w - this.w;
    }

    public String print() {
        return this.h + " " + this.w + " " + this.x;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        
        Student[] std = new Student[size];

        for (int i=0; i<size; i++) {
            int ih = sc.nextInt();
            int iw = sc.nextInt();
            
            std[i] = new Student(ih,iw,i+1);
        }

        Arrays.sort(std);

        for (int i=0; i<size; i++) {
            System.out.print(std[i].print());
            System.out.println();
        }
    }
}