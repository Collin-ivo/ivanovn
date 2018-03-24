package ru.job4j.loop;

public class Board {
    private StringBuilder screen = new StringBuilder();
    private String ln = System.lineSeparator();

    /**
     * @param width  - ширина таблицы
     * @param height - высота таблицы
     * @return - выводит таблицу на экран
     */
    public String paint(int width, int height) {
        for (int h = 1; h <= height; h++) {
            for (int w = 1; w <= width; w++) {
                if (h % 2 != 0 && w % 2 != 0) {
                    screen.append("X");
                } else if (h % 2 == 0 && w % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
