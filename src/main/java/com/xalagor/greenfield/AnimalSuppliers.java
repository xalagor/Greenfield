package com.xalagor.greenfield;

import java.util.Random;
import java.util.function.Supplier;

public class AnimalSuppliers {
    private static final Random random = new Random();

    // Supplier для волка
    public static Supplier<Animal> wolfSupplier() {
        return () -> new Wolf(new Vector(random.nextInt(100), random.nextInt(20)));
    }

    // Supplier для кролика
    public static Supplier<Animal> rabbitSupplier() {
        return () -> new Rabbit(new Vector(random.nextInt(100), random.nextInt(20)));
    }

    // Supplier для медведя
    public static Supplier<Animal> bearSupplier() {
        return () -> new Bear(new Vector(random.nextInt(100), random.nextInt(20)));
    }
}