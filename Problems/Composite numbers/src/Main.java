import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        int c = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // checking factors of the number
                c++;
            }
        }
        return c > 1;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}
