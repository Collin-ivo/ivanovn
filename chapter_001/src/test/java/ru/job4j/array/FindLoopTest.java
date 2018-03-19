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
    public void whenFive() {
        FindLoop find = new FindLoop();
        int[] dat = {1, 4, 9, 16, 25};
        int result = find.indexOf(dat, 9);

        int excepted = 2;
        assertThat(result, is(excepted));
    }
}
