package ru.job4j.array;

import java.util.Arrays;

/**
 * ArrayDuplicate
 *
 * @author Nikolay Ivanov (n_13@bk.ru)
 * @version "$"
 * @since 0.1
 */
    // Удаляет дубликаты, но меняет порядок значений.
    /*
    public String[] remove(String[] array) {
        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; in < unique; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[unique - 1];
                    unique--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }*/


//Удаляем дубликаты, порядок значений не меняется.

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; in < unique; in++) {
                if (array[out].equals(array[in])) {
                    for (int shift = in; shift < unique; shift++) {
                        if (shift < (unique - 1)) {
                            array[shift] = array[shift + 1];
                        }
                    }
                    unique--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }


}
