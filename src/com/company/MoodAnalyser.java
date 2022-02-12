package com.company;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser(String message){

        this.message = message;
    }
    public String analyseMood() {
       try{
           if (message.contains("SAD"))
               return  "SAD";
           else
               return "HAPPY";
       }catch(NullPointerException e){
           return "HAPPY";
       }
    }
}