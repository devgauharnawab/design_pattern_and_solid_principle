package single_responsibilty_principle;

public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        long amountDeposited = bankService.deposit(1000, "123456789");
        System.out.println("Amount Deposited: " + amountDeposited);

        long amountWithdrawn = bankService.withdraw(500, "123456789");
        System.out.println("Amount Withdrawn: " + amountWithdrawn);

        bankService.printPassbook();

        LoanService loanService = new LoanService();
        loanService.getLoanInterestInfo("homeLoan");

        NotificationService notificationService = new NotificationService();
        notificationService.sendOTP("email");

        PrinterService printerService = new PrinterService();
        printerService.printPassbook();
    }
}
