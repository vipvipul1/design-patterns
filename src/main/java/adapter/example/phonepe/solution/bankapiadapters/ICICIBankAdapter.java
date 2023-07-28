package adapter.example.phonepe.solution.bankapiadapters;

import adapter.example.phonepe.solution.bankapis.ICICIBankApi;

public class ICICIBankAdapter implements BankApi {
    private ICICIBankApi iciciBankApi;

    public ICICIBankAdapter(ICICIBankApi iciciBankApi) {
        this.iciciBankApi = iciciBankApi;
    }

    @Override
    public double checkBalance(int accountNo) {
        Double balance = iciciBankApi.fetchBalance(accountNo);
        return balance != null ? balance : -1;
    }

    @Override
    public boolean sendMoney(int senderAcc, int receiverAcc, double amount) {
        int trxnResponse = iciciBankApi.transferMoney(senderAcc, receiverAcc, amount);
        return trxnResponse == 1;
    }

    @Override
    public boolean bookFixedDeposit(int sender, double amount) {
        int trxnResponse = iciciBankApi.applyFixedDeposit(sender, amount);
        return trxnResponse == 1;
    }
}
