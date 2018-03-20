package ru.job4j.array;

/**
 * FindLoop
 *
 * @author Nikolay Ivanov (n_13@bk.ru)
 * @version "1$"
 * @since 0.1
 */

public class FindLoop {

    /*int[] data;
    int el;*/
    public int indexOf(int[] data, int el) {

        int rsl = -1; // если элемента нет в массиве, то возвращаем -1.

        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rsl = index;

                break;
            }
        }
        return rsl;
    }
/*
    public static void main(String[] args) {

        FindLoop test = new FindLoop();
        int[] setup = {1, 3, 9, 16};
        int set = test.indexOf(setup, 1);

        System.out.print(set);

        set = test.indexOf(setup, 1);
        System.out.print(set);

    }*/
}
