package ru.job4j.list;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SimpleQueueTest {
    SimpleQueue<Integer> container;

    @Before
    public void fillStack() {
        container = new SimpleQueue<>();
        container.push(1);
        container.push(2);
        container.push(3);
    }

    @Test
    public void checkSequence() {
        assertThat(container.poll(), is(1));
        assertThat(container.poll(), is(2));
        assertThat(container.poll(), is(3));
    }

    @Test
    public void checkPollPushSequence() {
        container.poll();
        container.push(4);
        assertThat(container.poll(), is(2));
        assertThat(container.poll(), is(3));
        assertThat(container.poll(), is(4));
    }
}
