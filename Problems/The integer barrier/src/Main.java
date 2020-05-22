import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int readNumber;
        int sum = 0;
        int target = 1000;

        do {
            readNumber = reader.nextInt();
            sum += readNumber;
            if (readNumber == 0) {
                System.out.println(sum);
                break;
            } else if (sum >= target) {
                System.out.println(sum - target);
                break;
            }
        } while (sum < 1000);
    }
}
