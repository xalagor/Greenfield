/**
 * Location
 *
 * <p>Пространственные координаты X и Y для обозначения положения, дельты перемещения, направления и т.д.</p>
 *
 * @author Xalagor
 * @version 1.0
 * @since 28-Jan-25
 */

package com.xalagor.greenfield;

/**
 * Пространственные координаты X и Y для обозначения положения, дельты перемещения, направления и т.д.
 */
public class Vector {
    private int x;
    private int y;

    /** Создать вектор по x и y
     * @param x Положение по горизонтали считая слева-направо
     * @param y Положение по вертикали считая сверху-вниз
     */
    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return
     */
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Метод для сложения векторов
    public Vector add(Vector other) {
        return new Vector(this.x + other.x, this.y + other.y);
    }

    // Метод для вычитания векторов
    public Vector subtract(Vector other) {
        return new Vector(this.x - other.x, this.y - other.y);
    }

    // Метод для умножения вектора на скаляр
    public Vector multiply(int scalar) {
        return new Vector(this.x * scalar, this.y * scalar);
    }

    // Метод для проверки равенства векторов
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vector vector = (Vector) obj;
        return x == vector.x && y == vector.y;
    }

    @Override
    public int hashCode() {
        return 31 * x + y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
