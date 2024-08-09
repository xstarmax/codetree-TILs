import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();

        int maxN = 0;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c == '0') {
                
                String flipped = a.substring(0, i) + "1" + a.substring(i + 1);
                int decimal = Integer.parseInt(flipped, 2);
                maxN = Math.max(maxN, decimal);
            } else {
                
                String flipped = a.substring(0, i) + "0" + a.substring(i + 1);
                int decimal = Integer.parseInt(flipped, 2);
                maxN = Math.max(maxN, decimal);
            }
        }

        System.out.println(maxN);
    }
}