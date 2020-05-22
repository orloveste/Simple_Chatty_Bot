import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int startHour = scanner.nextInt();
        int startMinuts = scanner.nextInt();
        int startSeconds = scanner.nextInt();
        int compareHour = scanner.nextInt();
        int compareMinuts = scanner.nextInt();
        int compareSeconds = scanner.nextInt();
        System.out.println((compareHour - startHour) * 3600 + (compareMinuts - startMinuts) * 60
                + compareSeconds - startSeconds);
    }
}