import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int firstNumber = reader.nextInt(); //15;
        int secondNumber = reader.nextInt(); //25;
        int divisor = reader.nextInt(); //5;
        int var = firstNumber;
        int count = 0;
        while (var <= secondNumber) {
            if (var % divisor == 0) {
                count++;
            }
            var++;
        }
        System.out.println(count);
    }
}
