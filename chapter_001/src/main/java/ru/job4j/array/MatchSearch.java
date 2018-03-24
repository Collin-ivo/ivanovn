package ru.job4j.array;

/**
 * MatchSearch
 *
 * @author Nikolay Ivanov (n_13@bk.ru)
 * @version "$"
 * @since 0.1
 */

public class MatchSearch {
    private char[] data;
    private char[] value;

    public MatchSearch(String origin, String sub) {
        this.data = origin.toCharArray();
        this.value = sub.toCharArray();
    }

    /**
     * Проверяет. что слово содержит строку.
     *
     * @return если origin содержит sub.
     */
    public boolean containsWith() {
        boolean result = true;
        int valueIndex = 0;
        for (int index = 0; index < this.value.length; index++) {
            if (this.value.length > this.data.length) {
                result = false;
                break;
            }
            if ((this.value[valueIndex] == this.data[index])) {
                result = true;
                valueIndex++;
            } else {
                result = false;
            }
        }
        return result;
    }
}
