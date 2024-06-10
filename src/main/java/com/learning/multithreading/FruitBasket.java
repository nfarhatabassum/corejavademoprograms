package com.learning.multithreading;

import java.util.ArrayList;
import java.util.List;

public class FruitBasket {
    private List<String> fruits = new ArrayList<>();
    public  void addToBasket(String fruit){
        fruits.add(fruit);
    }
    public List<String> getFruits(){
        return fruits;
    }
}
