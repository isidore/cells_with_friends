package org.samples;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Cell> cells = new ArrayList<>();

    public Cell[] getLivingCells() {
        return cells.toArray(new Cell[0]);
    }

    public void addCell(int x, int y, Color color) {
        Cell cell = new Cell(x, y, color);
        cells.add(cell);
    }

    public void advanceTime() {
        
        addCell(1,1, Color.GREEN);
    }
}
