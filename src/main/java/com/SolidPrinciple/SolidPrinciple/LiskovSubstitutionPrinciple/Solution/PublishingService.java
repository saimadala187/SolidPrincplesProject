package com.SolidPrinciple.SolidPrinciple.LiskovSubstitutionPrinciple.Solution;

public interface PublishingService {
    //@support Facebook,Instagram
    public abstract void publishPost(Object post);
}
