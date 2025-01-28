package com.xalagor.greenfield;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Simulation {
    private Island island;
    private ScheduledExecutorService scheduler;

    public Simulation() {
        island = Island.getInstance();
        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        grid.parallelStream().forEach(column ->
                column.parallelStream().forEach(cell ->
                        cell.forEach(actor -> executor.submit(actor::tick))
                )
        );
    }


    public void start() {
        scheduler.scheduleAtFixedRate(this::simulatePlants, 0, 1, TimeUnit.SECONDS);
        scheduler.scheduleAtFixedRate(this::simulateAnimals, 0, 1, TimeUnit.SECONDS);
        scheduler.scheduleAtFixedRate(this::printStatistics, 0, 1, TimeUnit.SECONDS);
        
        // Создаём саплаеры для спавна животных
        WeightedRandomSupplier<Animal> animalSupplier = new WeightedRandomSupplier<>();
        animalSupplier.addSupplier(AnimalSuppliers.wolfSupplier(), 0.1); // 10% волков
        animalSupplier.addSupplier(AnimalSuppliers.rabbitSupplier(), 0.7); // 70% кроликов
        animalSupplier.addSupplier(AnimalSuppliers.bearSupplier(), 0.2); // 20% медведей
        
        for (int i = 0; i < 5; i++) {
            island.addActor(animalSupplier.get());
        }
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
