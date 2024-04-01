import java.util.Scanner;
public class BonusCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the current year: ");
        int currentYear = scanner.nextInt();

        System.out.println("Enter the year of joining: ");
        int joiningYear = scanner.nextInt();

        int yearsOfService = currentYear - joiningYear;

        if (yearsOfService > 5) {
            System.out.println("Congratulations! You have served the organization for more than 5 years. You get a bonus of Rs. 5000/-");
        } else if (yearsOfService >= 3 && yearsOfService <= 5) {
            System.out.println("Congratulations! You have served the organization for 3-5 years. You get a bonus of Rs. 3000/-");
        } else {
            System.out.println("No Bonus is awarded");
        }
    }
}
