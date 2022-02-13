package com.company;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenSad_shouldReturnHappy() {
        InvalidMood invalidMood = new InvalidMood();
        String mood = invalidMood.analyseMood("Im in HAPPY mood");
        Assert.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenMessage_WhenNotSad_shouldReturnNull() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try{
            moodAnalyser.analyseMood(null);
        }catch (MoodAnalysisException e) {
            Assert.assertEquals("Please enter proper message",e.getMessage());
        }
    }
}