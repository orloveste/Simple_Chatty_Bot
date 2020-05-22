import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        double max = scanner.nextDouble();
        double variabila = 0;
        double suma = 0;
        int count = 0;
        while (min % 3 != 0) {
            min++;
        }
        variabila = min + variabila;
        for ( ; variabila <= max; count++) {
            suma = suma + variabila;
            variabila = variabila + 3;
        }
        System.out.println(suma / count);
    }
}
