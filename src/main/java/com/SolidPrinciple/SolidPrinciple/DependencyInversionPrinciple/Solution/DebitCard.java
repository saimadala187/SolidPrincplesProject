package com.SolidPrinciple.SolidPrinciple.DependencyInversionPrinciple.Solution;

public class DebitCard implements Banking {

    @Override
    public void doTransaction(int amount) {
        System.out.println("Transaction of amount "+amount+" is done using Debit Card");
    }
}
