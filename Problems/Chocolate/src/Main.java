import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int segmentsLigthN = scanner.nextInt();
        int segmentsWidthM = scanner.nextInt();
        int checkSegmentsK = scanner.nextInt();
        if ((segmentsLigthN * segmentsWidthM) > checkSegmentsK) {
            if (checkSegmentsK % segmentsLigthN == 0 || checkSegmentsK % segmentsWidthM == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }

    }
}
// fail test 5
//5
//12
//100
