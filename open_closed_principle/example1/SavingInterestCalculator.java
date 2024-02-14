package open_closed_principle.example1;

public class SavingInterestCalculator implements InterestCalculator {

    @Override
    public double calculateInterest(double balance) {
        return  balance * 0.05; // Assuming interest rate is 5% per month
    } 
}
