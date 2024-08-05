import java.util.Scanner;

class Product {
    String n;
    int c;

    public Product (String name, int code) {
        this.n = name;
        this.c = code;
    }
    
    public Product() {
        this.n = "codetree";
        this.c = 50;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a1 = sc.next();
        int a2 = sc.nextInt();

        Product product1 = new Product();
        Product product2 = new Product(a1, a2);

        System.out.printf("product %d is %s\n", product1.c, product1.n);
        System.out.printf("product %d is %s", product2.c, product2.n);
    }
}