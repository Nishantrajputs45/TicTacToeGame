package controllers;

import models.GameState;
import models.Player;
import services.GameService;
import services.strategies.WinningStrategies.WinningStrategy;

import java.util.List;

public class GameController {
    private GameService gameService;

    public GameController() {
        this.gameService = new GameService();
    }

    public void startGame(List<Player> players, List<WinningStrategy> winningStrategies){
         gameService.startGame(players,winningStrategies);
    }
    public void makeMove(){
        gameService.makeMove();
    }
    public GameState getGameState(){
        return gameService.getGameState();
    }
    public Player getWinner(){
        return gameService.getWinner();
    }
    public void printBoard(){
      gameService.printBoard();
    }

}
