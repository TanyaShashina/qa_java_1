package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {

    private int OnePet = 1;
    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens() {
        return getKittens(OnePet);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
