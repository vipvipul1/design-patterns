package adapter.example.phonepe.solution.bankapis;

// This a 3rd-party API given by ICICI Bank. We can't make any modifications to it.
public class ICICIBankApi {
    // Returns current balance >= 0.0 for success transaction. null for fail transaction.
    public Double fetchBalance(int accountNo) {
        System.out.println("ICICI: Fetching current balance of Account Number " + accountNo);
        return 3000.0;
    }

    // Returns 1/0 for success/fail transaction respectively.
    public int transferMoney(int senderAcc, int receiverAcc, double amount) {
        System.out.println("ICICI: Sending Rs " + amount + " from Account " + senderAcc + " to " + receiverAcc);
        return 1;
    }

    // Returns 1/0 for success/fail transaction respectively.
    public int applyFixedDeposit(int sender, double amount) {
        System.out.println("ICICI: Booking a FD in the account of " + sender + " for Rs " + amount);
        return 1;
    }
}
