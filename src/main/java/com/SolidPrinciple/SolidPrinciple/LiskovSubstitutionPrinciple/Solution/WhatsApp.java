package com.SolidPrinciple.SolidPrinciple.LiskovSubstitutionPrinciple.Solution;

public class WhatsApp implements SocialMedia,VideoCallService{
    // Noextra methods need to override here problem resolved.


    @Override
    public void chatWithFriend() {

    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall(String... users) {

    }
}
