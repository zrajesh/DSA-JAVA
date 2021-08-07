import java.util.Scanner;

public class Fibonacci {
    static int n1 = 0, n2 = 1, n3 = 0;

    public static void main(String[] args) {
        System.out.println("Enter the fibonacci number");
        Scanner in = new Scanner(System.in);
        int count = in.nextByte();
        System.out.print(n1 + " " + n2);
        PrintFibo(count - 2);
        System.out.println();
        System.out.println("Last Value: " + n3);
    }
    public static int PrintFibo(int count) {
        if(count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            PrintFibo(count - 1);
        }
        return 0;
    }
}
