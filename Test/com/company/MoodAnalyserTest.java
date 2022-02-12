package com.company;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenSad_shouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("Im in SAD Mood");
       Assert.assertEquals("SAD", mood);
    }
    @Test
    public void givenMessage_WhenNotSad_shouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Happy Mood ");
        Assert.assertEquals("SAD", mood);
    }
}