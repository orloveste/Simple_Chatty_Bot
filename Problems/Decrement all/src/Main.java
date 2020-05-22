// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num1 = Integer.parseInt(scanner.next());
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        System.out.print(--num1 + " " + --num2 + " " + --num3 + " " + --num4);
    }
}