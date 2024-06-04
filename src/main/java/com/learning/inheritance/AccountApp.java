package com.learning.inheritance;

public class AccountApp {
    public static void main(String[] args) {
//        SavingsAccount sa = new SavingsAccount(101,"Smith",1000);//Object are tightly coupled
//        System.out.println(sa.withdraw(100));
//        sa.addCredit(1000);
//        System.out.println(sa.getAccountDetails());
        //Runtime Polymorphism,
        // upcasting ===> Sub class object assign to super class refernce
        Account account1 = new SavingsAccount(101,"Smith",1000);
        Account account2 = new FixedAccount(); //loosely coupled

        //Down casting
        //SubClass objRef = (SubClass)superRef;
        if(account1 instanceof SavingsAccount) {
            SavingsAccount objRef = (SavingsAccount) account1;
        }
        if(account2 instanceof SavingsAccount){
            SavingsAccount objRef2 = (SavingsAccount) account2;
        }



    }
}
