public class Expense {
    private String expenseName;
    private double expenseAmount;

    //constructor
    public Expense (String expenseName, double expenseAmount) {
        this.expenseName = expenseName;
        this.expenseAmount = expenseAmount;
    }
    
    //getter
    public String getExpenseName() {
        return expenseName;
    }

    public double getExpenseAmount() {
        return expenseAmount;
    }
}
