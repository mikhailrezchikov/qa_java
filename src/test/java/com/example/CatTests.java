package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTests {

    @Mock
    Feline mockFeline;

    @Test
    public void testGetSoundReturnExpectedSound() {
        Cat cat = new Cat(mockFeline);
        String expectedResult = "Мяу";
        String actualResult = cat.getSound();
        Assert.assertEquals("Ожидаемый и фактический результат не совпадают", expectedResult, actualResult);
    }

    @Test
    public void testGetFoodReturnsExpectedListOfFood() throws Exception {
        Cat cat = new Cat(mockFeline);
        Mockito.when(mockFeline.eatMeat()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expectedResult = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualResult = cat.getFood();
        Assert.assertEquals("Ожидаемый и фактический результат не совпадают", expectedResult, actualResult);
    }
}