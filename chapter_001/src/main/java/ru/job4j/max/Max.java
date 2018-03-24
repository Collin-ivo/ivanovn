package ru.job4j.max;

/**
 * Максимумы чисел
 *
 * @author Nikolay Ivanov (n_13@bk.ru)
 * @version $Id$
 * @since 0.1
 */
public class Max {
    private int max;

    /**
     * Максимум из двух чисел
     *
     * @param first  первое
     * @param second второе
     * @return наибольшее число
     */
    public int max(int first, int second) {
        return ((first > second)) ? first : second;
    }

    /**
     * Максимум из трех чисел
     *
     * @param first  первое
     * @param second второе
     * @param third  третье
     * @return наибольшее число
     */
    public int max(int first, int second, int third) {
        return this.max(this.max(first, second), third);
    }
}