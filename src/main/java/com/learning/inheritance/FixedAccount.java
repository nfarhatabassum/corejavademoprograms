package com.learning.inheritance;

public class FixedAccount extends Account{
    public FixedAccount() {
    }

    public FixedAccount(int accountId, String accountHolderName, double balance) {
        super(accountId, accountHolderName, balance);
    }
    public double calculateRateOfInterest(int year){
        return 0;
    }
}
