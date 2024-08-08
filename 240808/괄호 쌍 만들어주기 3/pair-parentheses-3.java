import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        int ans=0;
        for (int i=0; i<str.length()-1; i++) {
            for (int j=i+1; j<str.length(); j++) {
                if (str.charAt(i) == '(' && str.charAt(j) == ')')
                    ans++;
            }
        }
        System.out.print(ans);
    }
}

// 확인할 문자 2개를 선택 -> nC2
// ( ) 조합이면 ans+1    -> 1
// 시간복잡도 O(n2)