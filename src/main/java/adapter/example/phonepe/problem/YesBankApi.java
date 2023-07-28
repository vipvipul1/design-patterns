package adapter.example.phonepe.problem;

public class YesBankApi {
    // Returns current balance >= 0.0 for success transaction. -1 for fail transaction.
    public double checkBalance(int accountNo) {
        System.out.println("Fetching current balance of Account Number " + accountNo);
        return 3000;
    }

    // Returns true/false for success/fail transaction respectively.
    public boolean sendMoney(int senderAcc, int receiverAcc, double amount) {
        System.out.println("Sending Rs " + amount + " from Account " + senderAcc + " to " + receiverAcc);
        return true;
    }

    // Returns true/false for success/fail transaction respectively.
    public boolean bookFixedDeposit(int sender, double amount) {
        System.out.println("Fixed Deposit booked in the account of " + sender + " for Rs " + amount);
        return true;
    }
}
