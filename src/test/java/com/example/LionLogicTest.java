package com.example;


import org.junit.Before;
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
    private Feline feline;

    @Test
    public void getFoodShouldReturnPredatorFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
        }
    @Test
    public void getKittensShouldReturnCorrectValueTest() throws Exception {
        when(feline.getKittens()).thenReturn(2);
        Lion lion = new Lion("Самка", feline);
        int kittens = lion.getKittens();
        assertEquals(2, kittens);
        }

    @Test(expected = Exception.class)
    public void lionConstructorThrowsExceptionOnInvalidSexTest() throws Exception {
        new Lion("Неопределён", feline);
    }
}
