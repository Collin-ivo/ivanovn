package ru.job4j.max;

/**
 * Максимум из двух чисел
 *
 * @author Nikolay Ivanov (n_13@bk.ru)
 * @version $Id$
 * @since 0.1
 */
public class Max {

    public int max(int first, int second) {
        int max = ((first - second) > 0) ? first : second;
        return max;
    }
}