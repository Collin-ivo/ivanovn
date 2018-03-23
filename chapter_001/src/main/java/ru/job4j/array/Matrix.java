package ru.job4j.array;

/**
 * Matrix
 *
 * @author Nikolay Ivanov (n_13@bk.ru)
 * @version "1$"
 * @since 0.1
 */

public class Matrix {

    public int[][] multiple(int size) {
        int[][] rsl = new int[size][size];
        for (int i = 0; i < rsl.length; i++) {
            for (int j = 0; j < rsl.length; j++) {
                rsl[i][j] = (i + 1) * (j + 1);
            }
        }
        return rsl;
    }
}
