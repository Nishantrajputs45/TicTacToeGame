package services.strategies.WinningStrategies;

import models.Board;
import models.Move;

public interface WinningStrategy {
    boolean isWinning(Board board, Move move);
}
