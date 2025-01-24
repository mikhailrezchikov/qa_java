package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTests {

    @Spy
    Feline SpyFeline;

    @Test
    public void testEatMeatReturnsExpectedListOfFood() throws Exception {
        Mockito.when(SpyFeline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expectedResult = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualResult = SpyFeline.eatMeat();
        Assert.assertEquals("Ожидаемый и фактический результат не совпадают", expectedResult, actualResult);
    }

    @Test
    public void testGetFamilyReturnsExpectedFamilyName() {
        Feline feline = new Feline();
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        Assert.assertEquals("Ожидаемый и фактический результат не совпадают", expectedResult, actualResult);
    }
}