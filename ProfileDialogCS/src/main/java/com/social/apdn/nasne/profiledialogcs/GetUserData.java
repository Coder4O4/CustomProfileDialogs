package com.social.apdn.nasne.profiledialogcs;

import java.net.URL;

public class GetUserData {
    private String name , location ,bio , profile;
    private double followers , followings;
    private boolean userLike;


    public GetUserData(String name, String location,
                       String bio, String profile, double followers,
                       double followings, boolean userLike) {
        this.name = name;
        this.location = location;
        this.bio = bio;
        this.profile = profile;
        this.followers = followers;
        this.followings = followings;
        this.userLike = userLike;
    }

    public GetUserData() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public double getFollowers() {
        return followers;
    }

    public void setFollowers(double followers) {
        this.followers = followers;
    }

    public double getFollowings() {
        return followings;
    }

    public void setFollowings(double followings) {
        this.followings = followings;
    }

    public boolean isUserLike() {
        return userLike;
    }

    public void setUserLike(boolean userLike) {
        this.userLike = userLike;
    }
}
