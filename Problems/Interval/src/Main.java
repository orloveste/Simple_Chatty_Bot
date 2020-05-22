import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        boolean caseTrue = input > -15 && input <= 12 || input > 14 && input < 17;
        boolean caseTrue1 = 19 <= input;
        if (caseTrue || caseTrue1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
