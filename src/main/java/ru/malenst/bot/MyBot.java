package ru.malenst.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.Locale;

public class MyBot extends TelegramLongPollingBot {
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
        switch (update.getMessage().getText().toLowerCase(Locale.ROOT)) {
            case "привет": {
                SendMessage message = new SendMessage();
                message.setChatId(update.getMessage().getChatId().toString());
                message.setText("Привет!");

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
