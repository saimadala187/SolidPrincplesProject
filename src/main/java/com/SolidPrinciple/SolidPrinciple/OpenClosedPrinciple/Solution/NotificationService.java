package com.SolidPrinciple.SolidPrinciple.OpenClosedPrinciple.Solution;

public interface NotificationService {

    //Definition: Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.

    //Problem: Modifying existing code to add new functionality can introduce bugs.

    //Creating Interface for Notification Service and the new feature or new medium can extend this.

    public void sendOTP(String medium);

}
