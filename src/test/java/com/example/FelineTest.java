package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    private Feline feline;

    @Test
    public void getKittensShouldReturnDefaultValueTest() {
        assertEquals(1, feline.getKittens());
        }

    @Test
    public void getKittensWithArgumentShouldReturnSameValueTest() {
        int count = feline.getKittens(3);
        assertEquals(3, count);
        }

    @Test
    public void getFamilyShouldReturnFelineFamilyTest() {
        assertEquals("Кошачьи", feline.getFamily());
        }

    @Test
    public void eatMeatShouldReturnPredatorFoodTest() throws Exception {
        List<String> food = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
        }

        @Test
    public void felineEatMeatReturnsPredatorFoodTest() throws Exception {
        feline.eatMeat();
            verify(feline).getFood("Хищник");
        }
}
