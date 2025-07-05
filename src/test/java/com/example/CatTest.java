package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline feline;

    @Test
    public void getSoundShouldReturnMeowTest() {
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodReturnsPredatorFoodTest() throws Exception {
        when(feline.eatMeat()).thenReturn(List.of("Рыба", "Птицы"));
        Cat cat = new Cat(feline);
        List<String> food = cat.getFood();
        assertEquals(List.of("Рыба", "Птицы"), food);
        verify(feline, times(1)).eatMeat();
    }

}
