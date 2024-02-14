package single_responsibilty_principle;

import java.util.HashMap;
import java.util.Map;

public class BankService {
    private Map<String, Long> accountBalances;

    public BankService() {
        this.accountBalances = new HashMap<>();
    }

    public long deposit(long amount, String accountNo) {
        // Deposit amount
        if (accountBalances.containsKey(accountNo)) {
            long currentBalance = accountBalances.get(accountNo);
            accountBalances.put(accountNo, currentBalance + amount);
        } else {
            accountBalances.put(accountNo, amount);
        }
        return amount;
    }

    public long withdraw(long amount, String accountNo) {
        // Withdraw amount
        if (accountBalances.containsKey(accountNo)) {
            long currentBalance = accountBalances.get(accountNo);
            if (currentBalance >= amount) {
                accountBalances.put(accountNo, currentBalance - amount);
                return amount;
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Account does not exist.");
        }
        return 0;
    }

    public void printPassbook() {
        // Print passbook
        System.out.println("Passbook Updated.");
    }
}
