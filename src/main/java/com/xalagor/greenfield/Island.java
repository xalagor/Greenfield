package com.xalagor.greenfield;

public class Island {
    private Location[][] locations;
    private SimulationSettings settings;
    private int width;
    private int height;

    public Island(int width, int height) {
        this.settings = settings;
        this.locations = new Location[settings.getIslandWidth()][settings.getIslandHeight()];
        initializeLocations();
    }

    private void initializeLocations() {
        for (int x = 0; x < settings.getIslandWidth(); x++) {
            for (int y = 0; y < settings.getIslandHeight(); y++) {
                locations[x][y] = new Location(settings.getMaxPlantsPerLocation(), settings.getMaxAnimalsPerLocation());
            }
        }
    }

    public Location getLocation(int x, int y) {
        return locations[x][y];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void printStatistics() {
        int totalAnimals = 0;
        int totalPlants = 0;

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Location location = getLocation(x, y);
                totalAnimals += location.getAnimals().size();
                totalPlants += location.getPlants().size();
            }
        }

        System.out.println("Total animals: " + totalAnimals);
        System.out.println("Total plants: " + totalPlants);
    }
}
