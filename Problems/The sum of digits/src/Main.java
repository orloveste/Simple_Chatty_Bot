// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();
        int result;
        if (num >= 100 && num <= 999) {
            int unitati = num % 10;
            int zeci = num % 100 / 10;
            int sute = num % 1000 / 100;
            result = unitati + zeci + sute;
            System.out.println(result);
        }
    }
}
