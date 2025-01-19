package com.SolidPrinciple.SolidPrinciple.InterfaceSegregationPrinciple.Problem;

public class PhonePay implements UPIPayments {
    @Override
    public void payMoney() {
        System.out.println("Paying Money");
    }

    @Override
    public void getScratchCard() {
        System.out.println("Getting Scratch Card");
    }

    @Override
    public void getCashBackAsCreditBalance() {
        // Not supported by Phone Pay. This creates the probloem

    }
}
