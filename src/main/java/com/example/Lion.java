package com.example;

import java.util.List;

public class Lion extends Feline {

    boolean hasMane;
    private final Kitten kitten;

    public Lion(String sex, Kitten kitten) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
        this.kitten = kitten;
    }

    public int getKittens() {
        return kitten.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return getFood("Хищник");
    }
}
