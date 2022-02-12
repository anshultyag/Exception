package com.company;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenSad_shouldReturnSad() {
        InvalidMood invalidMood = new InvalidMood();
        String mood = invalidMood.analyseMood("Im in HAPPY mood");
        Assert.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenMessage_WhenNotSad_shouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
}