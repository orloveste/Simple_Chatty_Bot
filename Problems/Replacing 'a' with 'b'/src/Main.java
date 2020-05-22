import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();

        System.out.println(word.replace('a', 'b'));
    }
}