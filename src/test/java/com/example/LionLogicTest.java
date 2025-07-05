package com.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class LionLogicTest {

    @Mock
    private FelineInterface feline;

    @Test
    public void getFoodShouldReturnPredatorFoodTest() throws Exception {
        when(feline.getFood(anyString())).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        Lion lion = new Lion("Самец", feline);
        List<String> food = lion.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
        verify(feline).getFood(anyString());
    }
    @Test
    public void getKittensShouldReturnCorrectValueTest() throws Exception {
        when(feline.getKittens()).thenReturn(2);
        Lion lion = new Lion("Самка", feline);
        int kittens = lion.getKittens();
        assertEquals(2, kittens);
        verify(feline, times(1)).getKittens();
    }

    @Test(expected = Exception.class)
    public void lionConstructorThrowsExceptionOnInvalidSexTest() throws Exception {
        FelineInterface feline = mock(FelineInterface.class);
        new Lion("Неопределён", feline);
    }
}
