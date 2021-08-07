import java.util.*;

public class Factorial {
   public static void main(String[] args) {
       System.out.println("Enter the number");
       Scanner num = new Scanner(System.in);
       int number = num.nextInt();
       FactCal factCal = new FactCal();
       System.out.println(factCal.CalFunc(number));
   }
}

class FactCal {
    public long CalFunc(int number) {
        if (number > 0) {
            long total =  number * CalFunc(number - 1);
            return total;
        } else if (number == 0 || number == 1) {
            return 1;
        } else {
            System.out.println("Factorial does not exist");
            return number;
        }
    }
}