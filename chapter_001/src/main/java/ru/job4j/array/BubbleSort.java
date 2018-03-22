package ru.job4j.array;

/**
 * BubbleSort
 *
 * @author Nikolay Ivanov (n_13@bk.ru)
 * @version "1$"
 * @since 0.1
 */

public class BubbleSort {
    /**
     * Сортировка пузырьком
     *
     */
    public int[] sort(int[] array) {

        for (int j = 0; j < array.length - 1; j++) {
            int f = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    // замена местами
                    int temp1 = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp1;
                    f = 1;
                }
            }
            if (f == 0) {
                break;
            }
        }


        return array;
    }
}
