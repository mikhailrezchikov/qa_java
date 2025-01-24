package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class LionParametrizedTests {

    @Mock
    Kitten mockKitten;
    private final String sex;
    private final boolean expectedHasMane;
    private final int expectedKittensCount;
    private final List<String> expectedLionListOfFood;

    public LionParametrizedTests(String sex, boolean expectedHasMane, int expectedKittensCount, List<String> expectedLionListOfFood) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
        this.expectedKittensCount = expectedKittensCount;
        this.expectedLionListOfFood = expectedLionListOfFood;
    }

    @Parameterized.Parameters
    public static Object[][] getCredentials() {
        return new Object[][] {
                {"Самка", false, 5, Arrays.asList("Животные", "Птицы", "Рыба")},
                {"Самец", true, 2, Arrays.asList("Животные", "Птицы", "Рыба")}
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetKittensReturnsExpectedCount() throws Exception {
        Lion lion = new Lion(sex, mockKitten);
        Mockito.when(mockKitten.getKittens()).thenReturn(expectedKittensCount);
        int actualResult = lion.getKittens();
        Assert.assertEquals("Ожидаемый и фактический результат не совпадают", expectedKittensCount, actualResult);
    }

    @Test
    public void testDoesHaveManeReturnsExpectedResult() throws Exception {
        Lion lionFemale = new Lion(sex, mockKitten);
        boolean actualResult = lionFemale.doesHaveMane();
        Assert.assertEquals("Ожидаемый и фактический результат не совпадают", expectedHasMane, actualResult);

    }

    @Test
    public void testGetFoodReturnsExpectedListOfFood() throws Exception {
        Lion lionMale = new Lion(sex, mockKitten);
        List<String> actualResult = lionMale.getFood();
        Assert.assertEquals("Ожидаемый и фактический результат не совпадают", expectedLionListOfFood, actualResult);
    }
}
