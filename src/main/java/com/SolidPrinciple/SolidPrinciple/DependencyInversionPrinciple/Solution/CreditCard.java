package com.SolidPrinciple.SolidPrinciple.DependencyInversionPrinciple.Solution;

public class CreditCard implements Banking {

    @Override
    public void doTransaction(int amount) {
        System.out.println("Transaction of amount "+amount+" is done using Credit Card");
    }
}
