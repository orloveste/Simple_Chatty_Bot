import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
        int startIncl = reader.nextInt();
        int endIncl = reader.nextInt();
        int sum = 0;
        for (int i = startIncl; i <= endIncl; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}