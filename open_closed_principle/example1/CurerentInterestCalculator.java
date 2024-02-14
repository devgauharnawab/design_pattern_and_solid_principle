package open_closed_principle.example1;

public class CurerentInterestCalculator implements  InterestCalculator{

    @Override
    public double calculateInterest(double balance) {
        
        return balance * 0.05; // current interest rate is set to 5%
    }
    
}
