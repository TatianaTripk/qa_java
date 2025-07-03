package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    @Mock
    private FelineInterface feline;

    @Test
    public void getFriendsReturnsCorrectListTest() throws Exception {
        LionAlex alex = new LionAlex(feline);
        List<String> expectedFriends = List.of("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман");
        Assert.assertEquals(expectedFriends, alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        LionAlex alex = new LionAlex(feline);
        Assert.assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void getKittensReturnsZeroTest() throws Exception {
        LionAlex alex = new LionAlex(feline);
        alex.getKittens();
        Assert.assertEquals(0, alex.getKittens());
    }
}
