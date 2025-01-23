package com.xalagor.greenfield;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Simulation {
    private Island island;
    private ScheduledExecutorService scheduler;

    public Simulation(int width, int height) {
        this.island = new Island(width, height);
        this.scheduler = Executors.newScheduledThreadPool(3);
    }

    public void start() {
        scheduler.scheduleAtFixedRate(this::simulatePlants, 0, 1, TimeUnit.SECONDS);
        scheduler.scheduleAtFixedRate(this::simulateAnimals, 0, 1, TimeUnit.SECONDS);
        scheduler.scheduleAtFixedRate(this::printStatistics, 0, 1, TimeUnit.SECONDS);
    }

    private void simulatePlants() {
        // Логика роста растений
    }

    private void simulateAnimals() {
        // Логика жизненного цикла животных
    }

    private void printStatistics() {
        // Вывод статистики
    }
}
