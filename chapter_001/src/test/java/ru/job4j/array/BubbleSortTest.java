package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * BubbleSortTest
 *
 * @author Nikolay Ivanov (n_13@bk.ru)
 * @version "1$"
 * @since 0.1
 */

public class BubbleSortTest {
        @Test
        public void sortBubble1() {
            BubbleSort bSort = new BubbleSort();
            int[] expectArray = {1, 2, 3, 5, 7};
            int[] resultArray = bSort.sort(new int[] {5, 1, 2, 7, 3});
            assertThat(resultArray, is(expectArray));
        }

    }
