import java.util.Scanner;
import java.util.Arrays;

class Weather implements Comparable<Weather> {
    String t;
    String d;
    String w;

    public Weather(String time, String day, String weather) {
        this.t = time;
        this.d = day;
        this.w = weather;
    }

    public String print() {
        return t + " " + d + " " + w;
    }

    @Override
    public int compareTo(Weather o) {
        return this.t.compareTo(o.t);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        Weather[] weather = new Weather[size];
        for (int i=0; i<size; i++) {
            String a1 = sc.next();
            String a2 = sc.next();
            String a3 = sc.next();

            weather[i] = new Weather(a1,a2,a3);
        }

        Arrays.sort(weather);

        for (int i=0; i<size; i++) {
            if (weather[i].w.equals("Rain")) { // 문자열비교
                System.out.print(weather[i].print());
                break;
            }
        }
    }
}