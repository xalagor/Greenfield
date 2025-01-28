package com.xalagor.greenfield;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.ArrayList;

/**
 * Главный остров, где находятся все акторы. Реализован как Singleton.
 */
public class Island {
    private SimulationSettings settings;

    // Единственный возможный экземпляр острова
    private static final Island instance = new Island();

    /** Получение единственного возможного экземпляра острова
     * @return Экземпляр острова Island
     */
    public static Island getInstance() {
        return instance;
    }

    private Vector size; // Размер острова (ширина и высота)

    // Сложная структура данных для хранения акторов
    List<List<Set<Actor>>> grid = new ArrayList<>(size.getX());
    for (int x = 0; x < width; x++) {
        grid.add(new ArrayList<>(size.getY()));
        for (int y = 0; y < size.getY(); y++) {
            grid.get(x).add(new ConcurrentSkipListSet<>());
        }
    }

    public void moveActor(Vector deltaLocation) {
        grid
    }

    public Island() {
        this.settings = settings;
        this.scenes = new Scene[settings.getIslandWidth()][settings.getIslandHeight()];
        initializeLocations();
    }

    private void initializeLocations() {
        for (int x = 0; x < size.getX(); x++) {
            for (int y = 0; y < size.getY(); y++) {
                scenes[x][y] = new Scene(new Vector(x, y));
            }
        }
    }

    public Scene getLocation(Vector position) {
        return scenes[position.getX()][position.getY()];
    }

    public Vector getSize() {
        return size;
    }

    public void printStatistics() {
        int totalAnimals = 0;
        int totalPlants = 0;

        for (int x = 0; x < size.getX(); x++) {
            for (int y = 0; y < size.getY(); y++) {
                Scene scene = getLocation(new Vector(x, y));
                totalAnimals += scene.getAnimals().size();
                totalPlants += scene.getPlants().size();
            }
        }

        System.out.println("Total animals: " + totalAnimals);
        System.out.println("Total plants: " + totalPlants);
    }

    public void addActor(Animal animal) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addActor'");
    }


}
