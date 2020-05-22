import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        int beginIndex = reader.nextInt();
        int ending = reader.nextInt();
        System.out.println(word.substring(beginIndex, ending + 1));
    }
}
