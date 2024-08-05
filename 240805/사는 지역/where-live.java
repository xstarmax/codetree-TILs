import java.util.Scanner;
import java.util.Arrays;

class Person implements Comparable<Person> {
    String n, p, l;
    
    public Person(String name, String phone, String location) {
        this.n = name;
        this.p = phone;
        this.l = location;
    }
    
    @Override
    public int compareTo(Person o)  {
        return o.n.compareTo(this.n); // 문자열 비교
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        Person[] pers = new Person[size];
        for (int i=0; i<size; i++) {
            String a1 = sc.next();
            String a2 = sc.next();
            String a3 = sc.next();

            pers[i] = new Person(a1,a2,a3);
        }
        
        Arrays.sort(pers);
        System.out.printf("name %s\n", pers[0].n);
        System.out.printf("addr %s\n", pers[0].p);
        System.out.printf("city %s\n", pers[0].l);
    }
}