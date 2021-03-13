package org.samples;

import java.awt.*;

public class Cell {
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }

    private final int x;
    private final int y;
    private final Color color;

    public Cell(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
}
