package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * FindLoopTest
 *
 * @author Nikolay Ivanov (n_13@bk.ru)
 * @version "1$"
 * @since 0.1
 */

public class FindLoopTest {
    @Test
    public void whenSixteen() {
        FindLoop find = new FindLoop();
        int[] setup = {1, 3, 9, 16, 20, 25, 30};
        int set = find.indexOf(setup, 16);
        assertThat(set, is(3));
    }
    @Test
    public void whenSix() {
        FindLoop find = new FindLoop();
        int[] setup = {1, 3, 9, 16, 20, 25, 30};
        int set = find.indexOf(setup, 6);
        assertThat(set, is(-1));
    }
}
