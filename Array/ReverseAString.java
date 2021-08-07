// Create a function that reverses a string.
import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = scan.nextLine();
        System.out.println("Method 1");
        System.out.println(StringReverse(input));
        System.out.println("Method 2");
        System.out.println(Reverse(input));
    }
    // Method1
    public static String StringReverse(String data) {
        int lengthOfString = data.length();
        if (lengthOfString < 2) {
            return "Please enter more than one character";
        }
        String reverse = "";
        for (int i = lengthOfString - 1; i >= 0; i--) {
            reverse = reverse + String.valueOf( data.charAt(i));
        }
        return reverse;
    }
    // Method 2
    public static String Reverse(String data) {
        return new StringBuilder(data).reverse().toString();
    }
}
