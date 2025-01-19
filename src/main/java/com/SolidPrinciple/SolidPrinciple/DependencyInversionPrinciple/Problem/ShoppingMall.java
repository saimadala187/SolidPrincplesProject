package com.SolidPrinciple.SolidPrinciple.DependencyInversionPrinciple.Problem;

public class ShoppingMall {
    private DebitCard debitCard;


    public ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void doPruchase(int amount){
        debitCard.doTransaction(amount);
    }

    public static void main(String[] args) {

        // Here if we need to change the payment to credit card we need to chnage whole code in ShoppingMall class


        DebitCard debitCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(debitCard);
        shoppingMall.doPruchase(1000);
    }

}
