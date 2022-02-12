package com.company;
public class InvalidMood {
    public String analyseMood(String message) {
       if (message.contains("SAD"))
            return "SAD";
        else
            return "HAPPY";
    }
}