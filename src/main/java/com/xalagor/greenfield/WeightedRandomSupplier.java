package com.xalagor.greenfield;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

import javafx.util.Pair;

public class WeightedRandomSupplier<T> {
    private final Random random = new Random();
    private final List<Pair<Supplier<T>, Double>> weightedSuppliers = new ArrayList<>();
    private double totalWeight = 0;
    
    public void addSupplier(Supplier<T> supplier, double weight) {
        weightedSuppliers.add(new Pair<>(supplier, weight));
        totalWeight += weight;
    }

    public T get() {
        double randomValue = random.nextDouble() * totalWeight;
        double cumulativeWeight = 0;

        for (Pair<Supplier<T>, Double> pair : weightedSuppliers) {
            cumulativeWeight += pair.getValue();
            if (randomValue <= cumulativeWeight) {
                return pair.getKey().get();
            }
        }

        throw new IllegalStateException("No supplier found");
    }
}
