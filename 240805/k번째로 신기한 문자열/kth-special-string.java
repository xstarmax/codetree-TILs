import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력 처리
        int size = sc.nextInt();
        int pos = sc.nextInt();
        String tar = sc.next();
    
        String temp;
        ArrayList<String> words = new ArrayList<>();

        for (int i=0; i<size; i++) {
            temp = sc.next();
            if (temp.startsWith(tar)) {
                words.add(temp);
            }
        }

        Collections.sort(words);
        System.out.print(words.get(pos-1));
    }
}