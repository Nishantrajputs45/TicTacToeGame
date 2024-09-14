package services.strategies.WinningStrategies;

import models.Board;
import models.Move;
import models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy{
    Map<Integer, Map<Symbol,Integer>> rowMap=new HashMap<>();
    @Override
    public boolean isWinning(Board board, Move move) {
        int row =move.getCell().getRow();
        Symbol symbol=move.getPlayer().getSymbol();
        //check if the current row present in map
        if(!rowMap.containsKey(row)){
            rowMap.put(row,new HashMap<>());
        }

        Map<Symbol,Integer> rowCount=rowMap.get(row);

        //check if symbol present in the row..
        if(!rowCount.containsKey(symbol)){
            rowCount.put(symbol,0);
        }
        rowCount.put(symbol,rowCount.get(symbol)+1);

        return rowCount.get(symbol)==board.getDimension();
    }
}
