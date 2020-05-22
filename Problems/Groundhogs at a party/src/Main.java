import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numberOfRees = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        if (isWeekend && numberOfRees >= 15 && numberOfRees <= 25) {
            System.out.println(true);
        } else if (!isWeekend && numberOfRees >= 10 && numberOfRees <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        //System.out.println(isWeekend+" "+numberOfRees);
    }
}
