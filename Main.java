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

        String currency = "EUR";
        ArrayList<String> expenseNames = new ArrayList<>();
        ArrayList<Double> expenseAmounts = new ArrayList<>();
        ArrayList<String> savingsName = new ArrayList<>();
        ArrayList<Double> savingsAmount = new ArrayList<>();
        ArrayList<String> reminders = new ArrayList<>();

        System.out.println("Your salary is " + salary + currency);

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

        } else {
            System.out.println("No fixed expense added.");
            scanner.nextLine();
        }

        

        double totalExpenses = 0;
        for (int i = 0; i < expenseAmounts.size(); i++) {
            totalExpenses += expenseAmounts.get(i);
        }

        double remaining = salary - totalExpenses;

        double groceryLimit = 0;

        System.out.print("Do you want to set a grocery limit? (yes/no): ");
        String groceryAnswer = scanner.nextLine();

        if (groceryAnswer.equals("yes")) {

            System.out.print("Enter your grocery Limit: ");
            groceryLimit = scanner.nextDouble();
            scanner.nextLine();
            
            

            remaining = remaining - groceryLimit;

            System.out.println("Your grocery limit is "+ groceryLimit + currency);
            

        } else {

            System.out.println("No grocery limit added");

        }

        System.out.print("Do you want to save up for something? (yes/no) ");
        String savingsAnswer = scanner.nextLine();

        if (savingsAnswer.equals("yes")) {

            do{
                System.out.print("What do you want to save money for? ");
                String savingName = scanner.nextLine();

                System.out.print("Enter the amount you want to save per month: ");
                double savingAmount = scanner.nextDouble();
                scanner.nextLine();

                savingsName.add(savingName);

                savingsAmount.add(savingAmount);

                System.out.print("Do you have another thing to save for? ");
                savingsAnswer = scanner.nextLine();

            } while (savingsAnswer.equals("yes"));
        }  else {
            System.out.println("No savings set! ");
        }    
        
        double totalSavings = 0;
        for (int i = 0; i < savingsAmount.size(); i++) {
            totalSavings += savingsAmount.get(i);
        }
        remaining = remaining - totalSavings;

        System.out.print("Do you have any reminders for yourself? (yes/no): ");
        String reminderAnswer = scanner.nextLine();

        if (reminderAnswer.equals("yes")) {
            do {
                System.out.print("Enter your reminder: ");
                String reminder = scanner.nextLine();
                reminders.add(reminder);
                System.out.print("Do you have another reminder? (yes/no): ");
                reminderAnswer = scanner.nextLine();
            } while (reminderAnswer.equals("yes"));
        } else {
            System.out.println("No reminders added.");
        }

        
        System.out.println("\n--- MONTHLY SUMMARY ---");
        System.out.println("Income: " + currency + " " + salary);

        System.out.println("Fixed Expenses:");
        for (int i = 0; i < expenseNames.size(); i++) {
            System.out.println("  - " + expenseNames.get(i) + ": " + currency + " " + expenseAmounts.get(i));
        }

        System.out.println("Savings: ");
        for (int i=0; i < savingsName.size(); i++) {
            System.out.println("  - " + savingsName.get(i) + ": " + currency + " " + savingsAmount.get(i));
        }

        System.out.println("Reminders: ");
        for (int i=0; i<reminders.size(); i++) {
            System.out.println("  - " + reminders.get(i));
        }
        

        System.out.println("Total expenses: " + currency + " " + totalExpenses);
        System.out.println("Grocery limit: " + currency + " " + groceryLimit);
        System.out.println("Total savings: " + currency + " " + totalSavings);
        
        if (remaining > 0) {
            System.out.println("You can add " + currency + " " + remaining + 
                " as emergency fund! "
            );
        } else {
            System.out.println("You have no money for emergency fund! you are too broke!");
        }




        scanner.close();
    }
               

}
