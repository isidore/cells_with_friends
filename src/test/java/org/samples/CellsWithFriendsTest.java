package org.samples;

import org.approvaltests.awt.AwtApprovals;
import org.approvaltests.reporters.ClipboardReporter;
import org.approvaltests.reporters.UseReporter;
import org.junit.jupiter.api.Test;

public class CellsWithFriendsTest {
    @Test
//    @UseReporter(ClipboardReporter.class)
    void testBoard() {
        Board board = new Board();
//        board.setCell(0,0, Color.GREEN);
//        board.setCell(1,2, Color.GREEN);
//        board.setCell(0,2, Color.BLUE);
        AwtApprovals.verify(new BoardDisplay(board));
    }
}
