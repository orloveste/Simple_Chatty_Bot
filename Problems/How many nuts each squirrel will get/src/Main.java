import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int squirrelsN = scanner.nextInt();
        int nutsK = scanner.nextInt();
        if (squirrelsN > 0 && squirrelsN < 10_000 && nutsK > 0 && nutsK < 10_000) {
            System.out.println(nutsK / squirrelsN);
        }
    }
}
// fail test 6
//17
//1231
