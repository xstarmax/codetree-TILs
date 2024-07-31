import java.util.Scanner;
import java.util.Arrays;

class Person implements Comparable<Person> {
    String name;
    int height;
    int weight;
    
    public Person (String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person person) {
        return this.height - person.height; // 키 기준 오름차순
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 리스트 짜기
        int size = sc.nextInt();
        Person[] people = new Person[size];
        
        for (int i=0; i<size; i++) {
            String sname = sc.next();
            int mhei = sc.nextInt();
            int mwei = sc.nextInt();
            
            people[i] = new Person(sname, mhei, mwei);
        }

        Arrays.sort(people);

        for (int i=0; i<size; i++) {
            System.out.println(people[i].name + " " + people[i].height + " " + people[i].weight);
        }
    }
}