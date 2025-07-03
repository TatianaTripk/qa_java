package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    private Feline feline;

    @Test
    public void getKittensShouldReturnDefaultValueTest() {
        assertEquals(1, feline.getKittens());
        verify(feline, times(1)).getKittens();
    }

    @Test
    public void getKittensWithArgumentShouldReturnSameValueTest() {
        int count = feline.getKittens(3);
        assertEquals(3, count);
        verify(feline).getKittens(anyInt());
    }

    @Test
    public void getFamilyShouldReturnFelineFamilyTest() {
        assertEquals("Кошачьи", feline.getFamily());
        verify(feline).getFamily();
    }

    @Test
    public void eatMeatShouldReturnPredatorFoodTest() throws Exception {
        List<String> food = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
        verify(feline).getFood("Хищник");
    }
}
