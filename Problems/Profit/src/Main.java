import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int putMoney = reader.nextInt(); //100;
        int percentYear = reader.nextInt() * 100 / 100; //15 * 100 / 100;
        int expectedMoney = reader.nextInt(); //120;
        int howManyYearsNeed = 0;
        double capitalizare = putMoney;
        if (capitalizare != expectedMoney) {
            do {
                capitalizare = capitalizare + (capitalizare * percentYear / 100);
                howManyYearsNeed++;
            }  while (capitalizare < expectedMoney);
        }
        System.out.println(howManyYearsNeed);
    }
}
//Failed test #7 of 7. Check if you forgot that K may be equal to M todo???