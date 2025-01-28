package com.xalagor.greenfield;

import java.util.Set;

public abstract class Animal extends Actor {
    private double weight; // Вес животного
    private int maxCount; // Максимальное количество на клетке
    private int speed; // Скорость перемещения
    private double foodRequired; // Количество пищи для насыщения
    private boolean isAlive = true;

    public Animal(Vector position, String emoji, double weight, int maxCount, int speed, double foodRequired) {
        super(position, emoji);
        this.weight = weight;
        this.maxCount = maxCount;
        this.speed = speed;
        this.foodRequired = foodRequired;
    }

    // Геттеры и сеттеры
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFoodRequired() {
        return foodRequired;
    }

    public void setFoodRequired(double foodRequired) {
        this.foodRequired = foodRequired;
    }

    public abstract void eat();

    // Метод для перемещения
    public void move(Vector direction) {
        Vector newPosition = getPosition().add(direction);
        island.grid.
    }

    // Абстрактные методы для животных
    public abstract void eat();
    public abstract void reproduce();

    public void die() {
        this.isAlive = false;
    }

    public boolean isAlive() {
        return isAlive;
    }

    @Override
    public void tick() {
        Set<Actor> neighbors = grid.getNeighbors(x, y, 1);
        for (Actor a : neighbors) {
            if (a instanceof Animal) {
                this.eat((Animal)a);
                break;
            }
        }
        // Логика движения
        move(random.nextInt(3)-1, random.nextInt(3)-1);
        eat();
        reproduce();
    }
}
