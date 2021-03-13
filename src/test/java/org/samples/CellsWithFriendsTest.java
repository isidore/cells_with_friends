package org.samples;

import org.approvaltests.awt.AwtApprovals;
import org.approvaltests.reporters.ClipboardReporter;
import org.approvaltests.reporters.UseReporter;
import org.junit.jupiter.api.Test;

import java.awt.*;

@UseReporter(ClipboardReporter.class)
public class CellsWithFriendsTest {

    @Test
    void testBoard() {
        Board board = createStartingBoard();
        AwtApprovals.verify(new BoardDisplay(board));
    }
    @Test
    void testAdvanceTime() {
        Board board = createStartingBoard();
        board.advanceTime();
        AwtApprovals.verify(new BoardDisplay(board));
    }

    private Board createStartingBoard() {
        Board board = new Board();
        board.addCell(0,0, Color.GREEN);
        board.addCell(1,2, Color.GREEN);
        board.addCell(2,0, Color.BLUE);
        return board;
    }
}
