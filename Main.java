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
        ArrayList<String> expenseNames = new ArrayList<>();
        ArrayList<Double> expenseAmounts = new ArrayList<>();

        System.out.println("Your salary is " + currency + salary);

        System.out.print("Do you have any fixed expenses (yes/no)");
        String answer = scanner.next();

        if (answer.equals("yes")) {
            String anotherExpense = "yes";
            scanner.nextLine(); //fixes the buffer after salary input
            do {
                System.out.print("Enter the name of the expense: ");
                String expenseName = scanner.nextLine();
                System.out.print("Enter the amount: ");
                Double expenseAmount = scanner.nextDouble();
                scanner.nextLine(); //clears buffer after each amount
                expenseNames.add(expenseName);
                expenseAmounts.add(expenseAmount);
                System.out.print("Do you have another expense? (yes/no)");
                anotherExpense = scanner.nextLine();

            } while (anotherExpense.equals("yes"));

        }
        else {
            System.out.println("No fixed expense added.");
        }
            
        



        scanner.close();
    }
               

}
