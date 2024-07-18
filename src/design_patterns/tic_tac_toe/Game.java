package design_patterns.tic_tac_toe;

import design_patterns.tic_tac_toe.board.Board;
import design_patterns.tic_tac_toe.player.Player;

import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class Game {
    private final Queue<Player> players;
    private final Board board;
    private final Scanner sc = new Scanner(System.in);

    public Game(Queue<Player> players, Board board) {
        this.players = players;
        this.board = board;
    }

    public void initializeGame() {
        while (true){
            if(!isSpaceAvailable()){
                System.out.println("Game ended with a tie");
                return;
            }

            Player currentPlayer = players.peek();
            System.out.println(currentPlayer.getName() + "'s turn:");
            showBoard();
            System.out.println("Enter row column where you want to mark, e.g-> 0 2");
            int i = sc.nextInt();
            int j = sc.nextInt();
            if(board.board[i][j] != null){
                System.out.println("that cell is already marked, try again");
                continue;
            }
            board.board[i][j] = currentPlayer.getPlayingSymbol().getSymbolType();

            if(checkWinner(i, j)){
                System.out.println(currentPlayer.getName() + " is winner");
                sc.close();
                return;
            }
            players.offer(players.poll());
        }
    }

    private boolean isSpaceAvailable() {
        for(int i = 0; i < board.board.length; i++){
            for (int j = 0; j < board.board[0].length; j++){
                if(board.board[i][j] == null) return true;
            }
        }

        return false;
    }

    private boolean checkWinner(int i, int j) {
        //check in row
        if(board.board[i][0] == board.board[i][1] && board.board[i][1] == board.board[i][2]){
            return true;
        }

        //check in column
        if(board.board[0][j] == board.board[1][j] && board.board[1][j] == board.board[2][j]){
            return true;
        }

        if(i == 1 && j == 0) return false;
        if(i == 1 && j == 2) return false;
        if(i == 0 && j == 1) return false;
        if(i == 2 && j == 1) return false;

        //diagonal
        if(i == j && board.board[0][0] == board.board[1][1] && board.board[1][1] == board.board[2][2]){
            return true;
        }
        return i != j && board.board[0][2] == board.board[1][1] && board.board[1][1] == board.board[2][0];
    }

    private void showBoard(){
        for(int i = 0; i < board.board.length; i++){
            for(int j = 0; j < board.board[0].length; j++){
                System.out.print("| ");
                if(board.board[i][j] == null) System.out.print("  ");
                else System.out.print(board.board[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
    }
}
