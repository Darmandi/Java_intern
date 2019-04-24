package ru.job4j.set;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SimpleSetTest {
    SimpleSet<String> set = new SimpleSet<>(3);

    @Test
    public void checkDefaultConstructor() {
        set.add("First");
        set.add("Second");
        set.add("Third");
        set.add("Second");
        assertThat(set.size(), is(3));

    }
}
