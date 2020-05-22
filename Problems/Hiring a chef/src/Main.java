//put imports you need here
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
//        System.out.print("first name: ");
        String firstName = reader.next();
//        System.out.print("age: ");
        reader.nextLine();
        reader.next();
//        System.out.print("stage of education: ");
        reader.next();
//        System.out.print("years of experience: ");
        reader.next();
//        System.out.print("cuisine preference: ");
        String cuisinePreference = reader.next();

        System.out.println("The form for " + firstName + " is completed. We will contact " +
                "you if we need a chef that cooks " + cuisinePreference + " dishes.");
    }
}
