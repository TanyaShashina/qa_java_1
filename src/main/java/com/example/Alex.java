//доп.задание
package com.example;

import java.util.ArrayList;

public class Alex extends Lion {
    ArrayList<String> friends = new ArrayList<>();
    String sex = "Самец";
    private Feline feline;

    public Alex(String sex, Feline feline) throws Exception {
        super(sex, feline);
        this.sex = sex;
        this.feline = feline;
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public ArrayList<String> getFriends() {
        friends.add("Мелман");
        friends.add("Глория");
        friends.add("Марти");
        return friends;
    }

    public String getPlaceOfLiving() {
        return "Нью-Йорский зоопарк";
    }
}