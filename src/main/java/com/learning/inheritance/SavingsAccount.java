package com.learning.inheritance;

public class SavingsAccount extends Account{
    public SavingsAccount() {
    }

    public SavingsAccount(int accountId, String accountHolderName, double balance) {
        super(accountId, accountHolderName, balance);
    }

    public boolean withdraw(double amount){
       if((balance-amount)>=500){
           balance-=amount;
           return true;
       }
       return  false;
   }
   public void addCredit(double amount){
       System.out.println(balance);
       balance+=amount;
   }

}
