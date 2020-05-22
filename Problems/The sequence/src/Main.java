import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int initialMumber = reader.nextInt(); //7;
        int stop = 0;
        for (int i = 0; i <= initialMumber; i++) {
            for (int j = 0; j < initialMumber; j++) {
                if (i == j || stop == initialMumber) {
                    break;
                }
//                do {
                stop++;
                System.out.print(i + " ");
//                } while (stop != initialMumber);
            }
        }
    }
}
