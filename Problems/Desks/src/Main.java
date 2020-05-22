import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grup1 = scanner.nextInt();
        int grup2 = scanner.nextInt();
        int grup3 = scanner.nextInt();
        if (grup1 % 2 == 1) {
            grup1++;
        }
        if (grup2 % 2 == 1) {
            grup2++;
        }
        if (grup3 % 2 == 1) {
            grup3++;
        }

        System.out.println((grup1 + grup2 + grup3) / 2);
//        int sumStudents = grup1 + grup2 + grup3;
//        if (sumStudents % 2 == 0) {
//            System.out.println(sumStudents / 2);
//        } else {
//            System.out.println((sumStudents + 1) / 2);
//        }

//        System.out.println((grup1+grup2+grup3)/2);

//        System.out.println(grup1/2 + grup2/2 + grup3/2);
    }
}
//Failed test #6 of 10. Wrong answer
//
