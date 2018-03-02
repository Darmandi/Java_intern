package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenFirstHigher() {
        Max number = new Max();
        assertThat(number.max(2, 1), is(2));
    }
    @Test
    public void whenSecondHigher() {
        Max number = new Max();
        assertThat(number.max(3, 5), is(5));
    }
}
