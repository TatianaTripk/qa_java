package com.example;

import java.util.List;

public interface FelineInterface {
    List<String> getFood(String animalKind) throws Exception;
    int getKittens();
    int getKittens(int kittensCount);
}
