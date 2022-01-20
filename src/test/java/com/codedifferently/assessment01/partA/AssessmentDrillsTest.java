package com.codedifferently.assessment01.partA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssessmentDrillsTest {

    @Test
    public void nearHundredTest01(){
        int input = 93;
        AssessmentDrills assessmentDrills = new AssessmentDrills();
        Boolean actual = assessmentDrills.nearHundred(input);
        Assertions.assertTrue(actual);
    }

    @Test
    public void nearHundredTest02(){
        int input = 90;
        AssessmentDrills assessmentDrills = new AssessmentDrills();
        Boolean actual = assessmentDrills.nearHundred(input);
        Assertions.assertTrue(actual);
    }

    @Test
    public void nearHundredTest03(){
        int input = 90;
        AssessmentDrills assessmentDrills = new AssessmentDrills();
        Boolean actual = assessmentDrills.nearHundred(input);
        Assertions.assertFalse(actual);
    }

    @Test
    public void missingCharTest01(){
        String inputStr = "kitten";
        int index = 1;
        AssessmentDrills assessmentDrills = new AssessmentDrills();
        String expected = "ktten";
        String actual = assessmentDrills.missingChar(inputStr, index);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void missingCharTest02(){
        String inputStr = "kitten";
        int index = 0;
        AssessmentDrills assessmentDrills = new AssessmentDrills();
        String expected = "itten";
        String actual = assessmentDrills.missingChar(inputStr, index);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void missingCharTest03(){
        String inputStr = "kitten";
        int index = 4;
        AssessmentDrills assessmentDrills = new AssessmentDrills();
        String expected = "kittn";
        String actual = assessmentDrills.missingChar(inputStr, index);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void intMaxTest01(){
        int a = 1, b = 2, c=3;
        AssessmentDrills assessmentDrills = new AssessmentDrills();
        int expected = 3;
        int actual = assessmentDrills.intMax(a,b,c);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void intMaxTest02(){
        int a = 1, b = 4, c=3;
        AssessmentDrills assessmentDrills = new AssessmentDrills();
        int expected = 4;
        int actual = assessmentDrills.intMax(a,b,c);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void intMaxTest03(){
        int a = 5, b = 2, c=3;
        AssessmentDrills assessmentDrills = new AssessmentDrills();
        int expected = 5;
        int actual = assessmentDrills.intMax(a,b,c);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void specialElevenTest01(){
        int input = 22;
        AssessmentDrills assessmentDrills = new AssessmentDrills();
        boolean actual = assessmentDrills.specialEleven(input);
        Assertions.assertTrue(actual);
    }

    @Test
    public void specialElevenTest02(){
        int input = 23;
        AssessmentDrills assessmentDrills = new AssessmentDrills();
        boolean actual = assessmentDrills.specialEleven(input);
        Assertions.assertTrue(actual);
    }

    @Test
    public void specialElevenTest03(){
        int input = 24;
        AssessmentDrills assessmentDrills = new AssessmentDrills();
        boolean actual = assessmentDrills.specialEleven(input);
        Assertions.assertFalse(actual);
    }
}
