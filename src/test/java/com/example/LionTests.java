package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {

    @Mock
    Kitten mockKitten;

    @Test
    public void testInvalidSexThrowsException() throws Exception {
        try {
            Lion lion = new Lion("Тест", mockKitten);
            Assert.fail("Неизвестное исключение");
        } catch (Exception thrown) {
            Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", thrown.getMessage());
        }
    }
}