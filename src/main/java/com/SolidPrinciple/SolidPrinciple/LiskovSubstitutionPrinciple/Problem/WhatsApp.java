package com.SolidPrinciple.SolidPrinciple.LiskovSubstitutionPrinciple.Problem;

public class WhatsApp extends SocialMedia{

    //publish post is not supported but we need to override this  method


    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPost(Object post) {
        //WhatsApp does not support this feature

    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall(String... users) {

    }
}
