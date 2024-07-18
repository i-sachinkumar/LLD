package design_patterns.tic_tac_toe.player;

import design_patterns.tic_tac_toe.symbol.PlayingSymbol;

public class Player {
    private final String name;
    private final PlayingSymbol playingSymbol;

    public Player(String name, PlayingSymbol playingSymbol) {
        this.name = name;
        this.playingSymbol = playingSymbol;
    }

    public String getName() {
        return name;
    }

    public PlayingSymbol getPlayingSymbol() {
        return playingSymbol;
    }
}
