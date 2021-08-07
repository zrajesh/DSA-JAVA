import java.util.Scanner;

public class PowerProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base");
        int base = in.nextInt();
        System.out.println("Enter the power");
        int power = in.nextInt();
        System.out.println("The total value is: ");
        System.out.println(PowerFunc(base, power));
    }

    public static int PowerFunc(int base, int power) {
        if(power > 0) {
            int total = base * PowerFunc(base, power-1);
            return total;
        }
        return 1;
    }
}
