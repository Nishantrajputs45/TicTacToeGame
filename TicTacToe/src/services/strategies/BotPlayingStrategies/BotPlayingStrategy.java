package services.strategies.BotPlayingStrategies;

import models.Board;
import models.Cell;

public interface BotPlayingStrategy {

    public Cell makeMove(Board board);
}
