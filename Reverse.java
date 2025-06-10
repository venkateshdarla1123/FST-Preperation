import java.util.Scanner;
class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}