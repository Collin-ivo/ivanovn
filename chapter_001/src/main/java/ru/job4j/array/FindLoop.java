package ru.job4j.array;

/**
 * FindLoop
 *
 * @author Nikolay Ivanov (n_13@bk.ru)
 * @version "1$"
 * @since 0.1
 */

public class FindLoop {
    int rsl;

    /*int[] data;
    int el;*/
    public int indexOf(int[] data, int el) {

        rsl = -1; // если элемента нет в массиве, то возвращаем -1.

        for (int index : data) {
            if (data[index] == el) {
                rsl = index;

                break;
            } else {
                rsl = -1;
            }
        }
        return rsl;
    }
}
