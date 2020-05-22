// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int hight = scanner.nextInt(); //20;
        int dayMove = scanner.nextInt(); //7;
        int nightNegativeMove = scanner.nextInt(); //3;
        int countDay = 1;
        for (int i = dayMove; i < hight; i += dayMove - nightNegativeMove) {
            countDay++;
        }
        System.out.println(countDay);


    }
}

//test 7/20
//10
//10
//0
