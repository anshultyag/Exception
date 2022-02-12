package com.company;
public class HappyOrSadMood {
    private String analyseMood(String message) {
        if (message.contains("SAD"))
            return  "SAD";
        else
           return "HAPPY";
        }
    public static void main(String[] args) {
        HappyOrSadMood obj = new HappyOrSadMood();
        System.out.println(obj.analyseMood("I am SAD Mood"));
           }
}
