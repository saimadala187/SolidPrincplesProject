package com.SolidPrinciple.SolidPrinciple.DependencyInversionPrinciple.Solution;

public class ShoppingMall {
    private Banking banking;

    public ShoppingMall(Banking banking) {
        this.banking = banking;
    }

    public void purchaseItem(int amount){
        banking.doTransaction(amount);
    }

    public static void main(String[] args) {

        //Definition: High-level modules should not depend on low-level modules. Both should depend on abstractions.
        //Problem: Tight coupling between high-level and low-level modules makes code inflexible.

        Banking banking = new DebitCard();   // ONe place we can change the payment method it is easy for us.

        ShoppingMall shoppingMall = new ShoppingMall(banking);
        shoppingMall.purchaseItem(1000);
    }
}
