package com.example;

import java.util.Arrays;
import java.util.List;

public class LionAlex extends Lion {

    private static final List<String> FRIEND_LIST = Arrays.asList("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман");

    public LionAlex(FelineInterface feline) throws Exception {
        super("Самец", feline);
    }

    public List<String> getFriends() {
        return FRIEND_LIST;
    }

    public String getPlaceOfLiving() {
        return ("Нью-Йоркский зоопарк");
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
