import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        System.out.println(countCombinations(s));
    }

    public static int countCombinations(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'C') {
                for (int j = i + 1; j < s.length() - 1; j++) {
                    if (s.charAt(j) == 'O') {
                        for (int k = j + 1; k < s.length(); k++) {
                            if (s.charAt(k) == 'W') {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}