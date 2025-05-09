package Exception_Handling;

import java.util.Scanner;

public class ErrorHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Example 1: Handling NumberFormatException
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input); // Might throw NumberFormatException
            System.out.println("You entered: " + number);

            // Example 2: Handling ArithmeticException
            System.out.print("Enter a divisor (not zero): ");
            int divisor = scanner.nextInt();
            int result = 100 / divisor; // Might throw ArithmeticException
            System.out.println("100 divided by " + divisor + " is " + result);

            // Example 3: Throwing custom exception
            checkAge(15); // Change this to test custom exception

        } catch (NumberFormatException e) {
            System.out.println("Error: You must enter a valid number.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InvalidAgeException e) {
            System.out.println("Custom Error: " + e.getMessage());
        } catch (Exception e) {
            // Generic catch block for any other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("This block always runs (finally).");
            scanner.close(); // Always close resources
        }
    }

    // Method with throws declaration
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You must be 18 or older.");
        }
        System.out.println("Access granted.");
    }
}

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
