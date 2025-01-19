package com.SolidPrinciple.SolidPrinciple.SingleResponsibilityPrinciple.Solution;

public class BankingService {

    //Definition: A class should have only one reason to change. It means that a class should have a single responsibility or job.

    //Problem: A class that handles multiple responsibilities becomes difficult to maintain and test.


    //Solution is we need to follow the single responsibility principle and create a separate class for each responsibility.
    //So, we will create a separate class for OTPS money and Loans.
    //So, that if we want to add some extra functionality then we can create a separate class for that.

    public void depositMoney(){
        //Code for depositing money
    }

    public void withdrawMoney(){
        //Code for withdrawing money
    }
}
