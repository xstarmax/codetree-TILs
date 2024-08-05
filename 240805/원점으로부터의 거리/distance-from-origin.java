import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Dot implements Comparable<Dot> {
    int x, y, n;

    public Dot (int x, int y, int n) {
        this.x = x;
        this.y = y;
        this.n = n;
    }
    
    @Override
    public int compareTo(Dot o) {
        int thisDistance = Math.abs(this.x) + Math.abs(this.y);
        int otherDistance = Math.abs(o.x) + Math.abs(o.y);

        if (thisDistance == otherDistance)
            return this.n - o.n;
        else
            return thisDistance - otherDistance;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        Dot[] dot = new Dot[size];
        for (int i=0; i<size; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            dot[i] = new Dot(a,b,i+1);
        }

        Arrays.sort(dot);

        for (int i=0; i<size; i++)
            System.out.println(dot[i].n);
    } 
}