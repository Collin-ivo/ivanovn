package ru.job4j.array;

import java.util.Arrays;

/**
 * Square
 *
 * @author Nikolay Ivanov (n_13@bk.ru)
 * @version 1$
 * @since 0.1
 */

public class Square {

    public int[] calculate(int bound) {

        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = (i + 1) * (i + 1);

        }

        return rst;

    }
}
