/**
 * Actor
 *
 * <p>Объект, который можно разместить на сетке</p>
 *
 * @author Xalagor
 * @version 1.0
 * @since 28-Jan-25
 */

package com.xalagor.greenfield;

/**
 * Объект, который можно разместить на сетке
 */
public abstract class Actor {
    protected Vector position; // Местоположение на сетке
    private String emoji; // Emoji для отображения
    protected final Island island = Island.getInstance();

    public Actor(Vector position, String emoji) {
        this.position = position;
        this.emoji = emoji;
    }

    // Геттеры и сеттеры
    public Vector getPosition() {
        return position;
    }

    public void setPosition(Vector position) {
        this.position = position;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    // Абстрактный метод для обновления состояния объекта
    public abstract void act();
}
