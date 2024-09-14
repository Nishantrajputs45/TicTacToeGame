package models;

import lombok.Getter;
import lombok.Setter;
import services.BotPlayingStrategyFactory;
import services.strategies.BotPlayingStrategies.BotPlayingStrategy;

@Getter
@Setter
public class Bot extends Player{
    private BotDifficultyLevel difficultyLevel;

    public Bot(String name, Symbol symbol, BotDifficultyLevel difficultyLevel) {
        super(name, symbol, PlayerType.BOT);
        this.difficultyLevel = difficultyLevel;
    }
    public Cell makeMove(Board board){
        System.out.println(this.getName()+" 's turn");
        BotPlayingStrategy botPlayingStrategy= BotPlayingStrategyFactory.getBotPlayingStrategy(difficultyLevel);
        return botPlayingStrategy.makeMove(board);
    }
}
