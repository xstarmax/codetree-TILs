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
        if (o.x < 0)
            o.x = -(o.x);
        if (o.y < 0)
            o.y = - (o.y);
        if ((this.x + this.y) != (o.y + o.x))
            return Integer.compare(o.n, this.n);
        else
            return (this.x + this.y) - (o.y + o.x);
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