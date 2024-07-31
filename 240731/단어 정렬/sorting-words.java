import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String[] words = new String[size];
        for (int i=0; i<size; i++) {
            words[i] = sc.next();
        }
        Arrays.sort(words);

        for (int i=0; i<size; i++)
            System.out.println(words[i]);
    }
}