import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter operator (+, -, *, /):");
        String operator = scanner.next();

        double result = 0;
        if (operator.equals("+")) {
            result = num1 + num1;
        } else if (operator.equals("-")) {
            result = num1 - num1;
        } else if (operator.equals("*")) {
            result = num1 * num1;
        } else if (operator.equals("/")) {
            if (num1 != 0) {
                result = num1 / num1;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                return;
            }
        } else {
            System.out.println("Invalid operator");
            return;
        }

        System.out.println("Result: " + result);
    }
}
