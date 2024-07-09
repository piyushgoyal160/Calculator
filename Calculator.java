package Practice;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        // Prompt user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        // Prompt user to choose an operation
        System.out.println("Choose an operation: + for addition, - for subtraction, * for multiplication, / for division");
        char operation = sc.next().charAt(0);

        double result;

        // Perform the selected operation
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Error! Invalid operation.");
                return;
        }

        // Display the result to the user
        System.out.println("The result is: " + result);
    }
}
