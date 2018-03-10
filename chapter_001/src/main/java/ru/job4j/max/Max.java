package ru.job4j.max;

/**
 * Максимум из двух чисел
 *
 * @author Nikolay Ivanov (n_13@bk.ru)
 * @version $Id$
 * @since 0.1
 */
public class Max {

    private int max;

    public int max(int first, int second) {
        return ((first > second)) ? first : second;

    }

    public int max(int first, int second, int third) {
        return this.max(this.max(first, second), third);
    }
}