package com.SolidPrinciple.SolidPrinciple.InterfaceSegregationPrinciple.Solution;

public class GooglePay implements UPIPayments, CashBackManager {

    // Google pay can provide all three but phone pay and paytm can't prrovide seperately can implemtn them

    @Override
    public void payMoney() {
        System.out.println("Paying money");
    }

    @Override
    public void getScratchCard() {
        System.out.println("Getting scratch card");
    }

    @Override
    public void getCashBackAsCreditBalance() {
        System.out.println("Getting cash back as credit balance");
    }
}
