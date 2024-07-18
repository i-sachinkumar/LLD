package design_patterns.tic_tac_toe.symbol;

public class PlayingSymbol {
    private final SymbolType symbolType;

    public PlayingSymbol(SymbolType symbolType) {
        this.symbolType = symbolType;
    }

    public SymbolType getSymbolType() {
        return symbolType;
    }
}
