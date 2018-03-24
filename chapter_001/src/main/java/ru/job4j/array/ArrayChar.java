package ru.job4j.array;

/**
 * ArrayChar - Обертка над строкой
 *
 * @author Nikolay Ivanov (n_13@bk.ru)
 * @version "$"
 * @since 0.1
 */

public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет. что слово начинается с префикса.
     *
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int i = 0; i < value.length; i++) {
            if ((value[i] == this.data[i])) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
