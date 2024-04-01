import java.util.Scanner;
public class DivCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 7 == 0 && number % 13 == 0) {
            System.out.println(number + " is divisible by both 7 and 13.");

            int quotientBy7 = number / 7;
            int remainderBy7 = number % 7;
            int quotientBy13 = number / 13;
            int remainderBy13 = number % 13;

            System.out.println("Quotient when divided by 7: " + quotientBy7);
            System.out.println("Remainder when divided by 7: " + remainderBy7);
            System.out.println("Quotient when divided by 13: " + quotientBy13);
            System.out.println("Remainder when divided by 13: " + remainderBy13);
        } else {
            System.out.println(number + " is not divisible by both 7 and 13.");
        }
    }
}
