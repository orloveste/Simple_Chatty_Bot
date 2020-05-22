import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int howManyEntries = reader.nextInt();
        for (int i = 0; i < howManyEntries; i++) {
            int enterNumber = reader.nextInt();
            if (enterNumber % 6 == 0) {
                sum += enterNumber;
            }
        }
        System.out.println(sum);
    }
}