package com.xalagor.greenfield;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GreenfieldApplication extends Application {

    private static final int GRID_SIZE = 10; // Размер сетки (10x10)
    private GridPane gridPane;
    private Island island;

    @Override
    public void start(Stage primaryStage) {
        gridPane = new GridPane();
        island = new Island(GRID_SIZE, GRID_SIZE);

        // Добавляем тестовых животных
        island.getLocation(2, 3).addAnimal(new Wolf());
        island.getLocation(5, 5).addAnimal(new Rabbit());

        initializeGrid();

        Scene scene = new Scene(gridPane, 500, 500);
        primaryStage.setTitle("Island Simulation");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Анимация для обновления сетки
        new AnimationTimer() {
            @Override
            public void handle(long now) {
                updateGrid(island);
            }
        }.start();
    }

    private void initializeGrid() {
        updateGrid(island);
    }

    private void updateGrid(Island island) {
        gridPane.getChildren().clear();

        for (int x = 0; x < island.getWidth(); x++) {
            for (int y = 0; y < island.getHeight(); y++) {
                Location location = island.getLocation(x, y);
                String emoji = "🌿"; // Растения по умолчанию

                if (!location.getAnimals().isEmpty()) {
                    emoji = getEmojiForAnimal(location.getAnimals().get(0));
                }

                Label label = new Label(emoji);
                gridPane.add(label, x, y);
            }
        }
    }

    private String getEmojiForAnimal(Animal animal) {
        if (animal instanceof Wolf) return "🐺";
        if (animal instanceof Rabbit) return "🐇";
        if (animal instanceof Bear) return "🐻";
        return "❓";
    }

    public static void main(String[] args) {
        launch(args);
    }
}