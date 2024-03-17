//Polymorphism
// 2)Create a Java class MathOperations with overloaded methods for addition (add) that can accept two integers, three doubles, and two strings, respectively. Demonstrate the usage of these methods in the main method by adding two integers, three doubles, and concatenating two strings.


public class MathOperations {

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b, double c) {
        return a + b + c;
    }

    public static String add(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        
        int sumInt = add(5, 3);
        System.out.println("Sum of integers: " + sumInt);

        double sumDouble = add(2.5, 4.7, 1.8);
        System.out.println("Sum of doubles: " + sumDouble);

        String combinedString = add("Hello", " World!");
        System.out.println("Combined string: " + combinedString);
    }
}
