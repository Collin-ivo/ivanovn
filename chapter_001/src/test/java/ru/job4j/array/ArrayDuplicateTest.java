package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

/**
 * ArrayDuplicateTest
 *
 * @author Nikolay Ivanov (n_13@bk.ru)
 * @version "$"
 * @since 0.1
 */

public class ArrayDuplicateTest {
    @Test
    public void whenArrayHasDuplicateThenDropIt() {
        String[] input = {"1", "1", "2", "2", "3", "3"};
        String[] expect = {"1", "2", "3"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] result = duplicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(expect));
    }

    @Test
    public void whenArrayHasDuplicateNamesThenDropIt() {
        String[] input = {"Helen", "Anna", "Helen", "Molly", "Trixy", "Anna", "Molly", "Helen", "Leonardo", "Trixy"};
        String[] expect = {"Helen", "Anna", "Molly", "Trixy", "Leonardo"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] result = duplicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(expect));
    }
}
