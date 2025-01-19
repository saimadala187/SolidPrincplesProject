package com.SolidPrinciple.SolidPrinciple.DependencyInversionPrinciple.Problem;

public class CreditCard {
    public void doTransaction(int amount){
        System.out.println("Transaction of amount "+amount+" is done using Credit Card");
    }
}
