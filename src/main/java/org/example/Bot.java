package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Bot extends TelegramLongPollingBot {
    long chatID = 702504831L;
    int num = 0;

    @Override
    public String getBotUsername() {
        return "z1rl1_bot";
    }

    @Override
    public String getBotToken() {
        return "6134147237:AAGHKXZRRTT2fG8EPC4flq3g_sP-ADHI-OM";
    }

    @Override
    public void onUpdateReceived(Update update) {
        var msg = update.getMessage();
        if(update.hasMessage() && update.getMessage().hasText()){
            if(msg.getText().equals("/start")) {
                greeting();
            }
        } else if(update.hasCallbackQuery()){
            String callBackData = update.getCallbackQuery().getData();
            switch (callBackData) {
                case "1" -> {
                    valuesOfVariables(callBackData);
                    num = 1;
                }
                case "2" -> {
                    valuesOfVariables(callBackData);
                    num = 2;
                }
                case "3" -> {
                    valuesOfVariables(callBackData);
                    num = 3;
                }
                case "4" -> {
                    valuesOfVariables(callBackData);
                    num = 4;
                }
                case "5" -> {
                    valuesOfVariables(callBackData);
                    num = 5;
                }
                case "6" -> {
                    valuesOfVariables(callBackData);
                    num = 6;
                }
                case "7" -> {
                    valuesOfVariables(callBackData);
                    num = 7;
                }
            }
        }
        if(num == 1){
            answer1(msg);
        } else if(num == 2){
            answer2(msg);
        } else if(num == 3){
            answer3(msg);
        } else if(num == 4){
            answer4(msg);
        } else if(num == 5){
            answer5(msg);
        } else if(num == 6){
            answer6(msg);
        } else if(num == 7){
            answer7(msg);
        }

    }

    public void valuesOfVariables(String var){
        SendMessage sm = SendMessage.builder()
                .chatId(chatID)
                .text("№" + var + "\nВведите значение переменных!(в одну строку)").build();
        try {
            execute(sm);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void answer1(Message message) {
        String fake = message.getText();
        System.out.println(fake);
        String[] mas = fake.split(" ");
        double a = Double.parseDouble(mas[0]);
        double b = Double.parseDouble(mas[1]);
        double c = Double.parseDouble(mas[2]);
        double x = Double.parseDouble(mas[3]);
        double n = Double.parseDouble(mas[4]);
        double result = ((5 * Math.pow(a, n * x)) / (b + c)) - (Math.sqrt(Math.abs(Math.cos(Math.pow(x, 3)))));
        SendMessage sm = SendMessage.builder()
                .chatId(chatID)
                .text(String.valueOf(result)).build();
        try {
            execute(sm);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void answer2(Message message) {
        String fake = message.getText();
        System.out.println(fake);
        String[] mas = fake.split(" ");
        double x = Double.parseDouble(mas[0]);
        double y = Double.parseDouble(mas[1]);
        double w = Double.parseDouble(mas[2]);
        double a = Double.parseDouble(mas[3]);
        double result = (Math.abs(x - y) / Math.pow((1 + 2 * x), a)) - Math.exp(Math.sqrt(1 + w));
        SendMessage sm = SendMessage.builder()
                .chatId(chatID)
                .text(String.valueOf(result)).build();
        try {
            execute(sm);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void answer3(Message message) {
        String fake = message.getText();
        System.out.println(fake);
        String[] mas = fake.split(" ");
        double a = Double.parseDouble(mas[0]);
        double a1 = Double.parseDouble(mas[1]);
        double x = Double.parseDouble(mas[2]);
        double a2 = Double.parseDouble(mas[3]);
        double result = Math.sqrt(a + a1 * x + a2 * Math.pow(Math.sqrt(Math.abs(Math.sin(x))), 0.33));
        SendMessage sm = SendMessage.builder()
                .chatId(chatID)
                .text(String.valueOf(result)).build();
        try {
            execute(sm);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void answer4(Message message) {
        String fake = message.getText();
        System.out.println(fake);
        String[] mas = fake.split(" ");
        double a = Double.parseDouble(mas[0]);
        double x = Double.parseDouble(mas[1]);
        double result = Math.log(Math.abs(Math.pow(a, 7))) + Math.atan(x * x) + (Math.PI / (Math.sqrt(Math.abs(a + x))));
        SendMessage sm = SendMessage.builder()
                .chatId(chatID)
                .text(String.valueOf(result)).build();
        try {
            execute(sm);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void answer5(Message message) {
        String fake = message.getText();
        System.out.println(fake);
        String[] mas = fake.split(" ");
        double a = Double.parseDouble(mas[0]);
        double b = Double.parseDouble(mas[1]);
        double c = Double.parseDouble(mas[2]);
        double d = Double.parseDouble(mas[3]);
        double x = Double.parseDouble(mas[4]);
        double result = Math.pow(Math.sqrt(Math.pow(a + b, 2) / c + d) + Math.exp(Math.sqrt(x + 1)), 1.0 / 5.0);
        SendMessage sm = SendMessage.builder()
                .chatId(chatID)
                .text(String.valueOf(result)).build();
        try {
            execute(sm);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void answer6(Message message) {
        String fake = message.getText();
        double x = Double.parseDouble(fake);
        double result = Math.exp((2.0 * Math.sin(4.0 * x) + Math.pow(Math.cos(Math.pow(x, 2.0)), 2.0))) / (3.0 * x);
        SendMessage sm = SendMessage.builder()
                .chatId(chatID)
                .text(String.valueOf(result)).build();
        try {
            execute(sm);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void answer7(Message message) {
        String fake = message.getText();
        double x = Double.parseDouble(fake);
        double result = 0.25 * (((1.0 + Math.pow(x, 2.0)) / (1.0 - x)) + 0.5 * Math.tan(x));
        SendMessage sm = SendMessage.builder()
                .chatId(chatID)
                .text(String.valueOf(result)).build();
        try {
            execute(sm);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void greeting() {
        SendPhoto sendPhoto = SendPhoto.builder()
                .chatId(chatID)
                .photo(new InputFile(new File("C:\\Users\\kiril\\Desktop\\ca.png"))).caption("Здравствуйте, вас приветсвует бот по решению определенных " +
                        "арифметических выражений! Выберете нужный варинат!").build();
        InlineKeyboardMarkup markupInlIne = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsInLine = new ArrayList<>();
        List<InlineKeyboardButton> rowInLine  = new ArrayList<>();
        var button1 = new InlineKeyboardButton();
        button1.setText("1");
        button1.setCallbackData("1");
        var button2 = new InlineKeyboardButton();
        button2.setText("2");
        button2.setCallbackData("2");
        var button3 = new InlineKeyboardButton();
        button3.setText("3");
        button3.setCallbackData("3");
        var button4 = new InlineKeyboardButton();
        button4.setText("4");
        button4.setCallbackData("4");
        var button5 = new InlineKeyboardButton();
        button5.setText("5");
        button5.setCallbackData("5");
        var button6 = new InlineKeyboardButton();
        button6.setText("6");
        button6.setCallbackData("6");
        var button7 = new InlineKeyboardButton();
        button7.setText("7");
        button7.setCallbackData("7");

        rowInLine.add(button1);
        rowInLine.add(button2);
        rowInLine.add(button3);
        rowInLine.add(button4);
        rowInLine.add(button5);
        rowInLine.add(button6);
        rowInLine.add(button7);

        rowsInLine.add(rowInLine);
        markupInlIne.setKeyboard(rowsInLine);
        sendPhoto.setReplyMarkup(markupInlIne);

        try {
            execute(sendPhoto);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

}
