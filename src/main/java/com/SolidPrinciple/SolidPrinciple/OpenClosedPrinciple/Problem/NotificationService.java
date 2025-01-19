package com.SolidPrinciple.SolidPrinciple.OpenClosedPrinciple.Problem;

public class NotificationService {

    // If we use this feature for multiple cleints they are able to modify this so it effect the
    // other clients also. So, we need to follow Open Closed Principle.


    public void sendOTP(String medium){
        if(medium.equals("email")) {
            //Code for sending OTP to email
        }
        if(medium.equals("phone")) {
            //Code for sending OTP to phone
        }
    }
}
