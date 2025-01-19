package com.SolidPrinciple.SolidPrinciple.LiskovSubstitutionPrinciple.Solution;

public interface SocialMedia {

    //Definition: Objects of a superclass should be replaceable with objects of a subclass without altering the behavior of the program.

    //Problem: Violating LSP creates unexpected behavior when a subclass doesn’t follow the expected behavior of its superclass.

    //Here the solution common things we have added here and seperated other feature with new interfece


    //@support WhatsApp,Facebook,Instagram
    public abstract  void chatWithFriend();



    //@support WhatsApp,Facebook,Instagram
    public abstract  void sendPhotosAndVideos();


}
