package adapter.example.phonepe.solution.bankapiadapters;

import adapter.example.phonepe.solution.bankapis.YesBankApi;

public class YesBankAdapter implements BankApi {
    private YesBankApi yesBankApi;

    public YesBankAdapter(YesBankApi yesBankApi) {
        this.yesBankApi = yesBankApi;
    }

    @Override
    public double checkBalance(int accountNo) {
        return yesBankApi.checkBalance(accountNo);
    }

    @Override
    public boolean sendMoney(int senderAcc, int receiverAcc, double amount) {
        return yesBankApi.sendMoney(senderAcc, receiverAcc, amount);
    }

    @Override
    public boolean bookFixedDeposit(int sender, double amount) {
        return yesBankApi.bookFixedDeposit(sender, amount);
    }
}
