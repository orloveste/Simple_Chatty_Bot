import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String text = reader.nextLine();
        System.out.println(text.toLowerCase().startsWith("j"));
//
//        if (text.startsWith("J")) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
    }
}
