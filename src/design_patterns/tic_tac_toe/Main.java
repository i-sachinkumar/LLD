package design_patterns.tic_tac_toe;

import design_patterns.tic_tac_toe.board.Board;
import design_patterns.tic_tac_toe.player.Player;
import design_patterns.tic_tac_toe.symbol.SymbolO;
import design_patterns.tic_tac_toe.symbol.SymbolX;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Player1", new SymbolX());
        Player player2 = new Player("Player2", new SymbolO());

        Queue<Player> players = new LinkedList<>();
        players.add(player1);
        players.add(player2);

        Game ticTac = new Game(players, new Board(3));

        ticTac.initializeGame();
    }
}
