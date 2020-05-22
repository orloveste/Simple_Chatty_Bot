import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int input = scanner.nextInt();
        System.out.println(reverse(input));
    }

    private static int reverse(int input) {
        int backup = input;
        int count = 0;
        while (input != 0) {
         input = input / 10;
            count++;
        }
     input = backup;
        int sum = 0;
        for (int i = count; i > 0; i--) {
            int sum10 = 1;
            int last = input % 10;
            for (int j = 1; j < i; j++) {
                sum10 = sum10 * 10;
            }
            sum = sum + (last * sum10);
         input = input / 10;
        }
        return sum;
    }
}
