package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * MatrixTest
 *
 * @author Nikolay Ivanov (n_13@bk.ru)
 * @version "1$"
 * @since 0.1
 */

public class MatrixTest {
    @Test
    public void matrixFour() {
        Matrix matrix = new Matrix();
        int[] m0 = new int[] {1, 2, 3, 4};
        int[] m1 = new int[] {2, 4, 6, 8};
        int[] m2 = new int[] {3, 6, 9, 12};
        int[] m3 = new int[] {4, 8, 12, 16};
        int[][] expectArray = {m0, m1, m2, m3};
        int[][] resultArray = matrix.multiple(4);
        assertThat(resultArray, is(expectArray));
    }

}
