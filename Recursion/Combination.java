import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter total number");
        int number = in.nextInt();
        System.out.println("Enter r");
        int r = in.nextInt();
        System.out.println("Combination is: " + CalCombination(number, r));
    }
    static int fact(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res = res * i;
        }
        return res;
    }
    static int CalCombination(int number, int r) {
        return (fact(number) / ((fact(r) * fact(number-r))));
    }
}
