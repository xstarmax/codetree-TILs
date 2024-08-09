import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(countPairs(s));
    }

    public static int countPairs(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 2; j < s.length(); j++) {
                if (s.charAt(i) == '(' && s.charAt(i + 1) == '(' && s.charAt(j) == ')' && s.charAt(j - 1) == ')') {
                    count++;
                }
            }
        }
        return count;
    }
}