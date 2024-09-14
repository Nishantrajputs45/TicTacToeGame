import controllers.GameController;
import models.*;
import services.strategies.WinningStrategies.ColumnWinningStrategy;
import services.strategies.WinningStrategies.DiagonalWinningStrategy;
import services.strategies.WinningStrategies.RowWinningStrategy;
import services.strategies.WinningStrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        playTicTacToe();
    }

    private static void playTicTacToe() {
        System.out.println("welcome to Tic Tac Toe!!");
        List<Player> players=new ArrayList<>();
        players.add(new Player("Nishant",new Symbol('N'), PlayerType.HUMAN));
        //players.add(new Player("Gautam",new Symbol('G'), PlayerType.HUMAN));
        //Bot
        players.add(new Bot("Bot",new Symbol('B'),BotDifficultyLevel.EASY));

        List<WinningStrategy> winningStrategies=List.of(
                new RowWinningStrategy(),
                new ColumnWinningStrategy(),
                new DiagonalWinningStrategy()
        );

        GameController gameController=new GameController();
        gameController.startGame(players,winningStrategies);

        //play the Game

        while (gameController.getGameState()== GameState.IN_PROGRESS){
            gameController.printBoard();
            gameController.makeMove();
        }
      // Game Over
        System.out.println("Game Over!!");
        gameController.printBoard();
        if(gameController.getGameState()==GameState.ENDED){
            System.out.println("Winner is: "+gameController.getWinner().getName());
        }
        else {
            System.out.println("It is a Draw!");
        }
    }
}
