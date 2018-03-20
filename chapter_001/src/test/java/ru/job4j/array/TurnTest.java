package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * TurnTest
 *
 * @author Nikolay Ivanov (n_13@bk.ru)
 * @version "1$"
 * @since 0.1
 */

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] rsl = turn.back(new int[] {2, 6, 1, 4});
        assertThat(rsl, is(rsl));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] rsl = turn.back(new int[] {1, 2, 3, 4, 5});
        assertThat(rsl, is(rsl));
    }
}
