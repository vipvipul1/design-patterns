package adapter.example.phonepe.solution.bankapiadapters;

public interface BankApi {
    // Returns current balance >= 0.0 for success transaction. -1 for fail transaction.
    public double checkBalance(int accountNo);

    // Returns true/false for success/fail transaction respectively.
    public boolean sendMoney(int senderAcc, int receiverAcc, double amount);

    // Returns true/false for success/fail transaction respectively.
    public boolean bookFixedDeposit(int sender, double amount);
}