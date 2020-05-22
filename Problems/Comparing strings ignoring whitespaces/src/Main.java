import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
        String firstWord =  reader.nextLine();
        String wordToCheck = reader.nextLine();

        System.out.println(firstWord.replace(" ", "").equals(wordToCheck.replace(" ", "")));
    }
}
