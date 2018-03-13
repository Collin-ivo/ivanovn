package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * SquareTest
 *
 * @author Nikolay Ivanov (n_13@bk.ru)
 * @version "1$"
 * @since 0.1
 */

public class SquareTest {
    @Test
    public void whenFive() {
        Square square = new Square();
        int[] result = square.calculate(5);
        int[] excepted = new int[]{1, 4, 9, 16, 25};
        assertThat(result, is(excepted));
    }
}
