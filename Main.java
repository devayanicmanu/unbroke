import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

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

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + "! ");
        System.out.println("Lets organize your Finances!");

        double salary = getValidDouble(scanner, "Enter your Income: ");

        String currency = "EUR";
        ArrayList<Expense> expenses = new ArrayList<>();
        ArrayList<Savings> savings = new ArrayList<>();
        ArrayList<String> reminders = new ArrayList<>();

        System.out.println("Your salary is " + salary + currency);

        collectExpenses(scanner, expenses);

        double totalExpenses = 0;
        for (int i = 0; i < expenses.size(); i++) {
            totalExpenses += expenses.get(i).getExpenseAmount();
        }

        double remaining = salary - totalExpenses;

        double groceryLimit = 0;
        System.out.print("Do you want to set a grocery limit? (yes/no): ");
        String groceryAnswer = scanner.nextLine();

        if (groceryAnswer.equals("yes")) {

            groceryLimit = getValidDouble(scanner, "Enter your grocery Limit: ");
            scanner.nextLine();

            remaining = remaining - groceryLimit;

            System.out.println("Your grocery limit is "+ groceryLimit + currency);
            

        } else {
            System.out.println("No grocery limit added");
        }

        collectSavings(scanner, savings);

        double totalSavings = 0;

        for (int i = 0; i < savings.size(); i++) {
            totalSavings += savings.get(i).getSavingsAmount();
        }

        remaining = remaining - totalSavings;

        collectReminders(scanner, reminders);

        
        System.out.println("\n--- " + userName.toUpperCase() + "'S MONTHLY SUMMARY ---");
        System.out.println("Income: " + currency + " " + salary);

        System.out.println("Fixed Expenses:");
        for (int i = 0; i < expenses.size(); i++) {
            System.out.println("  - " + expenses.get(i).getExpenseName() + ": " + 
            currency + " " + expenses.get(i).getExpenseAmount());
        }

        System.out.println("Savings: ");
        for (int i=0; i < savings.size(); i++) {
            System.out.println("  - " + savings.get(i).getSavingsName() + ": " + currency + " " + savings.get(i).getSavingsAmount());
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

        System.out.println("Reminders: ");
        for (int i=0; i<reminders.size(); i++) {
            System.out.println("  - " + reminders.get(i));
        }

        scanner.close();
    }

    static void collectExpenses (Scanner scanner , ArrayList <Expense> expenses) {

        System.out.print("Do you have any fixed expenses (yes/no)");
        String answer = scanner.next();

        if (answer.equals("yes")) {
            String anotherExpense = "yes";
            scanner.nextLine(); //fixes the buffer after salary input

            do {
                System.out.print("Enter the name of the expense: ");
                String expenseName = scanner.nextLine();

                double expenseAmount = getValidDouble(scanner, "Enter the amount: ");
                scanner.nextLine();

                expenses.add(new Expense(expenseName, expenseAmount));

                System.out.print("Do you have another expense? (yes/no)");
                anotherExpense = scanner.nextLine();

            } while (anotherExpense.equals("yes"));

        } else {
            System.out.println("No fixed expense added.");
            scanner.nextLine();
        }
    }
         
    static void collectSavings (Scanner scanner, ArrayList <Savings> savings) {
        System.out.print("Do you want to save up for something? (yes/no) ");
        String savingsAnswer = scanner.nextLine();

        if (savingsAnswer.equals("yes")) {

            do{
                System.out.print("What do you want to save money for? ");
                String savingName = scanner.nextLine();

                double savingAmount = getValidDouble(scanner, "Enter the amount you want to save per month: ");
                scanner.nextLine();

                savings.add(new Savings(savingName, savingAmount));

                System.out.print("Do you have another thing to save for? (yes/no) ");
                savingsAnswer = scanner.nextLine();

            } while (savingsAnswer.equals("yes"));
        }  else {
            System.out.println("No savings set! ");
        }
    }

    static void collectReminders(Scanner scanner, ArrayList<String> reminders) {

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
    }

    static double getValidDouble(Scanner scanner, String prompt) {
        double value = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print(prompt);
                value = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number!");
                scanner.next();
            }
        }
        return value;
    }
}
