package org.example;

import static org.junit.jupiter.api.Assertions.*;

public class Main {
    public static void main(String[] args) {
        boolean result;
        String resultText;
        String phoneNumber;

        phoneNumber = "(+380)99-999-99-99";
        result = phoneNumber.matches("\\(\\+380\\)\\d{2}-\\d{3}-\\d{2}-\\d{2}");
        assertTrue(result);

        String text = "Я хочу    бути     програмістом";
        resultText = text.replaceAll("\\s+", " ");

        System.out.println(resultText);

        text = "<div>\n" +
                "<p>Символи круглих дужок <code>'('</code> та <code>')'</code>. <br />Ці символи\n" +
                "дозволяють отримати з рядка додаткову інформацію.\n" +
                "<br/>Зазвичай, якщо парсер регулярних виразів шукає в тексті інформацію\n" +
                "за заданим виразом і знаходить її - він просто повертає\n" +
                "знайдений рядок.</p>\n" +
                "<p align=\"right\">А ось тут <a href=\"google.com\">посилання</a>, щоб життя медом не здавалося.</p>\n" +
                "</div>";

        resultText = text.replaceAll("<[^>]+>", "");

        System.out.println(resultText);

    }

}