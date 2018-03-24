package ru.job4j.array;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * ArrayCharTest
 *
 * @author Nikolay Ivanov (n_13@bk.ru)
 * @version "$"
 * @since 0.1
 */

public class MatchSearchTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        MatchSearch word = new MatchSearch("Hello", "ell");
        boolean result = word.containsWith();
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        MatchSearch word = new MatchSearch("Hello", "ill");
        boolean result = word.containsWith();
        assertThat(result, is(false));
    }
}
