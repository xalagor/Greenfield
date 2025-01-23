package com.xalagor.greenfield;

public class Wolf extends Animal {
    public Wolf() {
        super(50, 30, 3, 8); // Вес, макс. количество, скорость, пища
    }

    @Override
    public void eat() {
        // Логика поедания других животных
    }

    @Override
    public void move() {
        // Логика перемещения
    }

    @Override
    public void reproduce() {
        // Логика размножения
    }
}
