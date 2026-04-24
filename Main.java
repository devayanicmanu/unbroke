import java.util.Scanner;
import java.util.ArrayList;
/**
 * UnBroke- A Genz expense tracker, mainly being built to save some money.
 * @author Devayani Chintha Manu
 * @version Java 25 2025-09-16 LTS
 */


public class Main{
    public static void main(String[] args) {

        System.out.println("WELCOME TO UNBROKE!!");
        System.out.println("This year is not going to be a broke year.");
        System.out.println("Lets fix them financial irresponsibilities!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Income: ");
        double salary = scanner.nextDouble();

        String currency = "€";
        System.out.println("Your salary is " + currency + salary);

        System.out.println("Do you have any fixed expenses (yes/no)");
        String answer = scanner.next();

        if (answer.equals("yes")) {
            System.out.println("Enter the name of the expense: ");
            System.out.println("Enter the amount: ");
        }
        else {
            System.out.println("No fixed expense added.");
        }



        scanner.close();
    }
               

}
