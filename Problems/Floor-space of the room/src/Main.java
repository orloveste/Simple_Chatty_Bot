import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String room;
        double a;
        double b;
        double c;
        double radius;

        switch (room = reader.nextLine()) {
            case "triangle" :
                a = reader.nextDouble();
                b = reader.nextDouble();
                c = reader.nextDouble();
                double s = (a + b + c) / 2.0d;
                System.out.println(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
                break;
            case "rectangle" :
                a = reader.nextDouble();
                b = reader.nextDouble();
                System.out.println(a * b);
                break;
            case "circle" :
                radius = reader.nextDouble();
                System.out.println(3.14 * radius * radius);
                break;
            default:
                System.out.println("Error something!");
                break;
        }
    }
}
//Failed test #2 of 27
// Test input: circle 5
// Correct output: 78.5
// Your code output: 78.53981633974483

//Failed test #4 of 27. Wrong answer
// double trouble in triangle formula

//Failed test #3 of 27. Wrong answer
// This is a sample test from the problem statement!
// Test input: triangle 3 4 5
// Correct output: 6.0
// Your code output: 36.0
