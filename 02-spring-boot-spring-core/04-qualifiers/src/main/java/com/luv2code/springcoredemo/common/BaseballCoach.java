package com.luv2code.springcoredemo.common;

public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Spend 30 min in batting Practice.";
    }
}
