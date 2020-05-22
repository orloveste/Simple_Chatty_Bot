import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int recomandedToSleep = scanner.nextInt();
        int oversleep = scanner.nextInt();
        int sleepHours = scanner.nextInt();

        if (sleepHours < recomandedToSleep) {
            System.out.println("Deficiency");
        } else if (sleepHours > oversleep) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}
