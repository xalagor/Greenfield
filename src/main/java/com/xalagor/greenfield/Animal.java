package com.xalagor.greenfield;

public abstract class Animal {
    private double weight; // Вес животного
    private int maxCount; // Максимальное количество на клетке
    private int speed; // Скорость перемещения
    private double foodRequired; // Количество пищи для насыщения
    private boolean isAlive = true;

    public Animal(double weight, int maxCount, int speed, double foodRequired) {
        this.weight = weight;
        this.maxCount = maxCount;
        this.speed = speed;
        this.foodRequired = foodRequired;
    }

    public abstract void eat();

    public abstract void move();

    public abstract void reproduce();

    public void die() {
        this.isAlive = false;
    }

    public boolean isAlive() {
        return isAlive;
    }


}
