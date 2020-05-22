import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
        int startNum = reader.nextInt(); //8;
        int lastNumber = reader.nextInt(); //16;
       
        for (int var = startNum; var <= lastNumber; var++) {
            if (var % 3 == 0 && var % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (var % 3 == 0) {
                System.out.println("Fizz");
            } else if (var % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(var);
            }
        }
    }
}
