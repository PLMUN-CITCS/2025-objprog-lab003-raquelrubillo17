import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt for and read an integer
        System.out.print("Enter an integer: ");
        int userInt = input.nextInt();
        
        // Prompt for and read a double
        System.out.print("Enter a decimal number: ");
        double userDouble = input.nextDouble();
        
        // Consume the leftover newline character
        input.nextLine();
        
        // Prompt for and read a string
        System.out.print("Enter a word or sentence: ");
        String userString = input.nextLine();
        
        // Output the values with formatting
        System.out.printf("Your integer: %d%n", userInt);
        System.out.printf("Your decimal number: %.2f%n", userDouble);
        System.out.printf("Your string: %s%n", userString);
        
        // Close the Scanner
        input.close();
    }
}
