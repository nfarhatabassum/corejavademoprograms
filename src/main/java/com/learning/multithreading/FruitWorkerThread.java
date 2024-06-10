package com.learning.multithreading;

public class FruitWorkerThread extends Thread{
    private String[] fruitsToAdd;
    private FruitBasket fruitBasket;
    public FruitWorkerThread(FruitBasket fruitBasket,String[] fruitsToAdd){
        this.fruitBasket = fruitBasket;
        this.fruitsToAdd = fruitsToAdd;
    }
    public void run(){
        for (String fruit:fruitsToAdd) {
            fruitBasket.addToBasket(fruit);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        FruitBasket fruitBasketData = new FruitBasket();
        String[] simpleFruits = {"Apple","Banana","Orange"};
        String[] seasonalFruits = {"Mango","Watermelon"};
        String[] dryFruits = {"Almond","Cashew"};

        FruitWorkerThread worker1 = new FruitWorkerThread(fruitBasketData,simpleFruits);
        FruitWorkerThread worker2 = new FruitWorkerThread(fruitBasketData,seasonalFruits);
        FruitWorkerThread worker3 = new FruitWorkerThread(fruitBasketData,dryFruits);
        worker3.start();
        worker1.start();
        worker2.start();



       worker1.join();
        worker2.join();
        worker3.join();

        System.out.println("Fruits List "+fruitBasketData.getFruits());
    }
}
