package services;

import models.BotDifficultyLevel;
import services.strategies.BotPlayingStrategies.BotPlayingStrategy;
import services.strategies.BotPlayingStrategies.EasyBotPlayingStrategy;
import services.strategies.BotPlayingStrategies.HardBotPlayingStrategy;
import services.strategies.BotPlayingStrategies.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel){
       return switch (botDifficultyLevel){
           case EASY -> new EasyBotPlayingStrategy();
           case MEDIUM -> new MediumBotPlayingStrategy();
           case HARD -> new HardBotPlayingStrategy();

        };
    }
}
