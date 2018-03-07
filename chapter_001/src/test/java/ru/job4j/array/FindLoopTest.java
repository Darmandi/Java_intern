package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void findIndexOf5() {
        FindLoop massiv = new FindLoop();
        assertThat(massiv.indexOf(new int[]{1, 3, 5}, 5), is(2));
    }
    @Test
    public void findIndexOf6() {
        FindLoop massiv = new FindLoop();
        assertThat(massiv.indexOf(new int[]{1, 3, 5}, 6), is(-1));
    }
}
