package services.strategies.BotPlayingStrategies;

import models.Board;
import models.Cell;
import models.CellState;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Cell makeMove(Board board) {
        //Generate a random move..
        int row,col;
        do{
            row=(int) (Math.random()*board.getDimension());
            col=(int) (Math.random()*board.getDimension());

        }while (board.getBoard().get(row).get(col).getCellState() != CellState.EMPTY);
        return new Cell(row,col);
    }
}
