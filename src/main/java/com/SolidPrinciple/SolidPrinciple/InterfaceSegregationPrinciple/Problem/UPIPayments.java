package com.SolidPrinciple.SolidPrinciple.InterfaceSegregationPrinciple.Problem;

public interface UPIPayments {

    // Google pay can provide all three but phone pay and paytm can't prrovide

    public void payMoney();


    public void getScratchCard();

    public void getCashBackAsCreditBalance();
}
