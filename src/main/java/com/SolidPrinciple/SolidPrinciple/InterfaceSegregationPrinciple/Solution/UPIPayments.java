package com.SolidPrinciple.SolidPrinciple.InterfaceSegregationPrinciple.Solution;

public interface UPIPayments {

    //Definition: A class should not be forced to implement interfaces it does not use.

    //Problem: Large, monolithic interfaces force implementing classes to include unused methods.

    public void payMoney();


    public void getScratchCard();

}
