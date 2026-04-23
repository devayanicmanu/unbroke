import java.util.Scanner;
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

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        String currency = "Euros";
        System.out.println("Your salary is " + salary + " " + currency);
        
        


        
        

        scanner.close();

    }
}