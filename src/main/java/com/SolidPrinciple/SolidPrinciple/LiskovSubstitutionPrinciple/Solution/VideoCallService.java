package com.SolidPrinciple.SolidPrinciple.LiskovSubstitutionPrinciple.Solution;

public interface VideoCallService {
    //@support WhatsApp,Facebook
    public abstract  void groupVideoCall(String... users);
}
