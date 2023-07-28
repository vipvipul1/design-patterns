package adapter.example.phonepe.problem;

public class PhonePe {
    public static void main(String[] args) {
        // Here Client(PhonePe) code is hard coupled with YesBankApi for performing any transactions below.
        // Switching to a new bank API might require us to change a lot of code.
        // E.g. sendMoney() in YesBankApi could be transferMoney() in ICICIBankApi.
        // Also, even if the methods might be same but return type might differ.
        // sendMoney() currently gives true/false for success/fail trxn.
        // transferMoney() may give 1/0 for success/fail trxn.
        // In these cases we need a way where we don't need to change the complete Client(PhonePe) code.
        // Only small modifications should enable the existing code work as is.
        int sender = 1234, receiver = 9876;
        int amount = 1000;

        YesBankApi bankApi = new YesBankApi();

        boolean sendResponse = bankApi.sendMoney(sender, receiver, amount);
        if (sendResponse) {
            System.out.println("Transfer successful!! Sender: " + sender + " Receiver: " + receiver + " Amount: " + amount);
        } else {
            System.out.println("Transfer failed!");
        }

        boolean fdBookResponse = bankApi.bookFixedDeposit(sender, amount);
        if (fdBookResponse) {
            System.out.println("Fixed Deposit booked successfully!! Account: " + sender + " Amount: " + amount);
        } else {
            System.out.println("FD booking failed!");
        }

        double curBalance = bankApi.checkBalance(sender);
        if (curBalance >= 0) {
            System.out.println("Current Balance in Account " + sender + ": " + curBalance);
        } else {
            System.out.println("Transaction failed!");
        }
    }
}
