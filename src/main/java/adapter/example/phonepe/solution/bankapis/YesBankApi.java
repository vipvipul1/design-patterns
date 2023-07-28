package adapter.example.phonepe.solution.bankapis;

import adapter.example.phonepe.solution.bankapiadapters.BankApi;

// This a 3rd-party API given by Yes Bank. We can't make any modifications to it.
public class YesBankApi {
    // Returns current balance >= 0.0 for success transaction. -1 for fail transaction.
    public double checkBalance(int accountNo) {
        System.out.println("Yes: Fetching current balance of Account Number " + accountNo);
        return 3000;
    }

    // Returns true/false for success/fail transaction respectively.
    public boolean sendMoney(int senderAcc, int receiverAcc, double amount) {
        System.out.println("Yes: Sending Rs " + amount + " from Account " + senderAcc + " to " + receiverAcc);
        return true;
    }

    // Returns true/false for success/fail transaction respectively.
    public boolean bookFixedDeposit(int sender, double amount) {
        System.out.println("Yes: Booking a FD in the account of " + sender + " for Rs " + amount);
        return true;
    }
}
