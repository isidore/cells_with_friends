package org.samples;

import javax.swing.*;
import java.awt.*;

public class BoardDisplay extends JPanel {
    private final int cellSize = 20;
    private Board board;

    public BoardDisplay(Board board) {
        this.board = board;
        this.setPreferredSize(new Dimension(cellSize * 20, cellSize * 20));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        paintGrid(g);
        for (Cell c : board.getLivingCells()) {
            drawCell(g, c.getX(), c.getY(), c.getColor());
        }
    }

    private void drawCell(Graphics g, int x, int y, Color color) {
        g.setColor(color);
        g.fillOval(x * cellSize + 1, y * cellSize + 1, cellSize - 2, cellSize - 2);
    }

    private void paintGrid(Graphics g) {
        for (int x = 0; x < 20; x++) {
            g.setColor(Color.BLACK);
            g.drawLine(x * cellSize, 0, x * cellSize, cellSize * 20);
            g.drawLine(0, x * cellSize, cellSize * 20, x * cellSize);
        }
    }
}
