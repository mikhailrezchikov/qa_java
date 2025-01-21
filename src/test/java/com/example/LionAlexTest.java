package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class LionAlexTest {

    @Test
    public void testGetFriends() throws Exception {
        LionAlex alex = new LionAlex();
        List<String> expectedResult = Arrays.asList(
                "зебра Марти",
                "бегемотиха Глория",
                "жираф Мелман");
        List<String> actualResult = alex.getFriends();
        Assert.assertEquals("Ожидаемый и фактический результат не совпадают", expectedResult,actualResult);
    }

    @Test
    public void testGetPlaceOfLiving() throws Exception {
        LionAlex alex = new LionAlex();
        String expectedResult = "Нью-Йоркский зоопарк";
        String actualResult = alex.getPlaceOfLiving();
        Assert.assertEquals("Ожидаемый и фактический результат не совпадают", expectedResult,actualResult);
    }

    @Test
    public void testGetKittens() throws Exception {
        LionAlex alex = new LionAlex();
        int expectedResult = 0;
        int actualResult = alex.getKittens();
        Assert.assertEquals("Ожидаемый и фактический результат не совпадают", expectedResult, actualResult);
    }
}