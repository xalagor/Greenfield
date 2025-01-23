package com.xalagor.greenfield;

import java.util.ArrayList;
import java.util.List;

public class Location {
    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();

    public Location(int maxPlantsPerLocation, int maxAnimalsPerLocation) {

    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public List<Plant> getPlants() {
        return plants;
    }
}
