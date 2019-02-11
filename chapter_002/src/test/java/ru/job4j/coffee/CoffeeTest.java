package ru.job4j.coffee;

import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CoffeeTest {
    @Test
    public void tes37() {
        Coffee c = new Coffee();
        assertThat(c.changes(37, 5), is(new int[] {10, 10, 10, 2}));
    }
    @Test
    public void tes6() {
        Coffee c = new Coffee();
        assertThat(c.changes(6, 5), is(new int[] {1}));
    }
    @Test
    public void tes23() {
        Coffee c = new Coffee();
        assertThat(c.changes(23, 0), is(new int[] {10, 10, 2, 1}));
    }
}
