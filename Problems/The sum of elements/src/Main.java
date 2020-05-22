import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int yourNum;
        int sum = 0;
        do {
            yourNum = reader.nextInt();
            sum = sum + yourNum;
        } while (yourNum != 0);
        System.out.println(sum);
    }
}
