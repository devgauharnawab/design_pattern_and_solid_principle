package single_responsibilty_principle;

public class LoanService {
    public void getLoanInterestInfo(String loanType) {
        if (loanType.equals("homeLoan")) {
            // Do some job related to home loan
            System.out.println("Home loan interest info retrieved.");
        }
        if (loanType.equals("personalLoan")) {
            // Do some job related to personal loan
            System.out.println("Personal loan interest info retrieved.");
        }
        if (loanType.equals("car")) {
            // Do some job related to car loan
            System.out.println("Car loan interest info retrieved.");
        }
    }
}
