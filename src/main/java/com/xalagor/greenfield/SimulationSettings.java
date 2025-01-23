package com.xalagor.greenfield;

/**
 * SimulationSettings
 *
 * <p>Хранит все настройки симуляции</p>
 *
 * @author Denis Petrov
 * @version 1.0
 * @since 1/23/2025
 */
public class SimulationSettings {
    // Размер острова
    private int islandWidth = 100;
    private int islandHeight = 20;

    // Максимальное количество растений и животных на клетке
    private int maxPlantsPerLocation = 200;
    private int maxAnimalsPerLocation = 500;

    // Вероятности передвижения животных (в процентах)
    private int wolfMovementProbability = 80;
    private int rabbitMovementProbability = 60;

    // Количество приплода у животных
    private int wolfOffspringCount = 2;
    private int rabbitOffspringCount = 4;

    // Длительность такта симуляции (в миллисекундах)
    private int simulationTickDuration = 1000;

    // Геттеры и сеттеры
    public int getIslandWidth() {
        return islandWidth;
    }

    public void setIslandWidth(int islandWidth) {
        this.islandWidth = islandWidth;
    }

    public int getIslandHeight() {
        return islandHeight;
    }

    public void setIslandHeight(int islandHeight) {
        this.islandHeight = islandHeight;
    }

    public int getMaxPlantsPerLocation() {
        return maxPlantsPerLocation;
    }

    public void setMaxPlantsPerLocation(int maxPlantsPerLocation) {
        this.maxPlantsPerLocation = maxPlantsPerLocation;
    }

    public int getMaxAnimalsPerLocation() {
        return maxAnimalsPerLocation;
    }

    public void setMaxAnimalsPerLocation(int maxAnimalsPerLocation) {
        this.maxAnimalsPerLocation = maxAnimalsPerLocation;
    }

    public int getWolfMovementProbability() {
        return wolfMovementProbability;
    }

    public void setWolfMovementProbability(int wolfMovementProbability) {
        this.wolfMovementProbability = wolfMovementProbability;
    }

    public int getRabbitMovementProbability() {
        return rabbitMovementProbability;
    }

    public void setRabbitMovementProbability(int rabbitMovementProbability) {
        this.rabbitMovementProbability = rabbitMovementProbability;
    }

    public int getWolfOffspringCount() {
        return wolfOffspringCount;
    }

    public void setWolfOffspringCount(int wolfOffspringCount) {
        this.wolfOffspringCount = wolfOffspringCount;
    }

    public int getRabbitOffspringCount() {
        return rabbitOffspringCount;
    }

    public void setRabbitOffspringCount(int rabbitOffspringCount) {
        this.rabbitOffspringCount = rabbitOffspringCount;
    }

    public int getSimulationTickDuration() {
        return simulationTickDuration;
    }

    public void setSimulationTickDuration(int simulationTickDuration) {
        this.simulationTickDuration = simulationTickDuration;
    }
}
