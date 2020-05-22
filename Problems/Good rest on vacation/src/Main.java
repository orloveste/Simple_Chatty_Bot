import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int days = scanner.nextInt();
        int foodCoastDay = scanner.nextInt();
        int flightCostOneWay = scanner.nextInt();
        int hotelCostDay = scanner.nextInt();

        System.out.println(foodCoastDay * days + flightCostOneWay * 2 +
                hotelCostDay * --days);
    }
}