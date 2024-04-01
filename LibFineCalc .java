import java.util.Scanner;
public class LibFineCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of days the member is late to return the book: ");
        int daysLate = scanner.nextInt();
        if (daysLate <= 7) {
            System.out.println("Fine: 50 paise");
        } else if (daysLate >= 8 && daysLate <= 14) {
            System.out.println("Fine: Rs. 1/-");
        } else if (daysLate > 14 && daysLate <= 21) {
            System.out.println("Fine: Rs. 5/-");
        } else {
            System.out.println("Your membership is cancelled due to returning the book after 21 days.");
        }
    }
}
