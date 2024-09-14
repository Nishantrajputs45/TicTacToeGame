package services.strategies.WinningStrategies;

import models.Board;
import models.Move;
import models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class ColumnWinningStrategy implements WinningStrategy {
    Map<Integer, Map<Symbol, Integer>> colMap = new HashMap<>();

    @Override
    public boolean isWinning(Board board, Move move) {
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();
        //check if the current row present in map
        if (!colMap.containsKey(col)) {
            colMap.put(col, new HashMap<>());
        }

        Map<Symbol, Integer> colCount = colMap.get(col);

        //check if symbol present in the row..
        if (!colCount.containsKey(symbol)) {
            colCount.put(symbol, 0);
        }
        colCount.put(symbol, colCount.get(symbol) + 1);

        return colCount.get(symbol) == board.getDimension();
    }
}