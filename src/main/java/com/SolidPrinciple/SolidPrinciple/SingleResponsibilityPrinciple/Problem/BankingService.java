package com.SolidPrinciple.SolidPrinciple.SingleResponsibilityPrinciple.Problem;

public class BankingService {
    //For this Example we are taking the Banking Service.
    //For Banking we can have multiple functionalities like Deposit, Withdraw, OTP, loan etc.

    //Problem  In here if bank want to add some extra loan types and OTP types then we have to modify the existing code.
    //So, this class is violating the Single Responsibility Principle.


    public void depositMoney(){
        //Code for depositing money
    }

    public void withdrawMoney(){
        //Code for withdrawing money
    }

    public void generateOTP(String medium){
        if(medium.equals("email")) {
            //Code for generating OTP and sending it to email
        }
        //Code for generating OTP
    }

    public void provideLoan(String medium){
        //Code for providing loan
        if(medium.equals("car")){
            //write the logic
        }

    }


}
