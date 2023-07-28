package adapter.example.phonepe.solution;

import adapter.example.phonepe.solution.bankapiadapters.BankApi;
import adapter.example.phonepe.solution.bankapiadapters.ICICIBankAdapter;
import adapter.example.phonepe.solution.bankapiadapters.YesBankAdapter;
import adapter.example.phonepe.solution.bankapis.ICICIBankApi;
import adapter.example.phonepe.solution.bankapis.YesBankApi;

public class PhonePe {
    public static void main(String[] args) {
        // Here Client(PhonePe) code is not hard coupled with YesBankApi for performing any transactions below.
        // Switching to a new bank API (ICICIBankApi) will require us to just change
        // the object creation of YesBankApi() to ICICIBankApi().
        int sender = 1234, receiver = 9876;
        int amount = 1000;

        // Just uncomment below for a new ICICI Bank API in case Yes Bank is facing any RBI issues.
        // All other method calls would work fine due to a new ICICIBankAdapter
        // we created for the ICICIBankApi given by ICICI Bank.
//        BankApi bankApi = new ICICIBankAdapter(new ICICIBankApi());
        BankApi bankApi = new YesBankAdapter(new YesBankApi());

        boolean sendResponse = bankApi.sendMoney(sender, receiver, amount);
        if (sendResponse) {
            System.out.println("Transferred successfully!! Sender: " + sender + " Receiver: " + receiver + " Amount: " + amount);
        } else {
            System.out.println("Transfer failed!");
        }

        boolean fdBookResponse = bankApi.bookFixedDeposit(sender, amount);
        if (fdBookResponse) {
            System.out.println("FD booked successfully!! Account: " + sender + " Amount: " + amount);
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
