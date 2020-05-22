import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
        String text = reader.nextLine(); //"Augsburg";
        System.out.println(text.endsWith("burg"));
    }
}