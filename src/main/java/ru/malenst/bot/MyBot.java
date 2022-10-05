package ru.malenst.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class MyBot  extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "the_trader_game_bot";
    }

    @Override
    public String getBotToken() {
        return "5622050732:AAFcLsfz-DPBTukYzCpxvNDlUFyWdT7pPVQ";
    }

    @Override
    public void onUpdateReceived(Update update) {

    }
}
