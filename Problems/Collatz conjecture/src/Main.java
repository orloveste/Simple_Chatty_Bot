import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int givenNumber = reader.nextInt(); //17;
        System.out.print(givenNumber + " ");
        while (givenNumber > 1) {
            do {
                if (givenNumber % 2 == 0) {
                    givenNumber = givenNumber / 2;
                } else {
                    givenNumber = givenNumber * 3 + 1;
                }
                System.out.print(givenNumber + " ");
            } while (givenNumber != 1);
        }
    }
}
