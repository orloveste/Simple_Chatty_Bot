import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt(); //100;
        int b = reader.nextInt(); //105;
        long product;
        if (a < b) {
            product = a;
            for (int i = ++a; i < b; i++) {
                product = product * i;
            }
        } else {
            product = b;
            for (int i = ++b; i < a; i++) {
                product = product * i;
            }
        }
        System.out.println(product);

    }
}
