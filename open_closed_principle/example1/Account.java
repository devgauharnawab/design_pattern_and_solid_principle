package open_closed_principle.example1;

public class Account {
    private double balance;
    private String accountNo;
    private InterestCalculator interestCalculator;

    public double calculateInterest(){
        return interestCalculator.calculateInterest(balance);
    }
    
}
