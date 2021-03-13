package org.samples;

import java.awt.*;

public class Board {
    public Cell[] getLivingCells() {
        return new Cell[]{
          new Cell(0,0, Color.green),
          new Cell(1,2, Color.green),
          new Cell(0,2, Color.BLUE),
        };
    }
}
