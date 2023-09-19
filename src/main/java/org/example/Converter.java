package org.example;

import java.util.Scanner;

public class Converter {
    public void startApp() {
        System.out.println("Wrire your text:");
        String userText = getUserText();
        String[] splitText = splitText(userText);
        String textResult = setCaseText(splitText);
        System.out.println("Text: " + userText + "Text result: " + textResult);

    }


    public String getUserText() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String[] splitText(String userText) {
        return userText.split("");
    }

    public String setCaseText(String[] splitText) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < splitText.length; i++) {
            if (i % 2 == 0) stringBuilder.append(splitText[i].toLowerCase());
            else stringBuilder.append(splitText[i].toUpperCase());
        }
        return String.valueOf(stringBuilder);
    }

}
