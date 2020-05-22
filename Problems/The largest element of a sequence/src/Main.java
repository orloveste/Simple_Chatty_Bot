import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
        int bigNum = 0;
        int enterNum;
        do {
            enterNum = reader.nextInt();
             if (enterNum > bigNum) {
                 bigNum = enterNum;
             }
        } while (enterNum != 0);
        System.out.println(bigNum);
    }
}
