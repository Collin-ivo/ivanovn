package ru.job4j.loop;

public class Board {
        private StringBuilder screen = new StringBuilder();
        private String ln = System.lineSeparator();

    public String paint(int width, int height) {
        // цикл за высоту доски
        for (int h = 1; h <= height; h++) {
            // цикл за ширину доски
            for (int w = 1; w <= width; w++) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if (h % 2 != 0 && w % 2 != 0) {
                    screen.append("X");
                    //System.out.print("X");
                } else if (h % 2 == 0 && w % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                   //System.out.print(" ");
                }
            }

            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}
