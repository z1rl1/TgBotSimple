package org.example;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
        Bot bot = new Bot();                  //We moved this line out of the register method, to access it later
        botsApi.registerBot(bot);
       // bot.greeting(702504831L);
       //bot.sendText(702504831L, "Здравствуйте, вас приветсвует бот по решению определенных " +
         //       "арифметических выражений! Выберете нужный варинат!");  //The L just turns the Integer into a Long
    }
}
