package design_patterns.tic_tac_toe.board;

import design_patterns.tic_tac_toe.symbol.SymbolType;

public class Board {
    private final int size;
    public SymbolType[][] board;

    public Board(int size) {
        this.size = size;
        board = new SymbolType[size][size];
    }

    public int getSize() {
        return size;
    }
}
