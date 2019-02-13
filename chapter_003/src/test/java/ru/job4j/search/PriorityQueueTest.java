package ru.job4j.search;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class PriorityQueueTest {
    PriorityQueue queue = new PriorityQueue();
    @Before
    public void fillQue() {
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        queue.put(new Task("middle 2", 3));
        queue.put(new Task("low 2", 6));
        queue.put(new Task("urgent 2", 2));
    }
    @Test
    public void whenHigherPriority() {
        assertThat(queue.take(0).getDesc(), is("urgent"));
    }
    @Test
    public void whenHighPriority() {
        assertThat(queue.take(1).getDesc(), is("urgent 2"));
    }
    @Test
    public void whenMiddlePriority() {
        assertThat(queue.take(3).getDesc(), is("middle 2"));
    }
    @Test
    public void whenLowPriority() {
        assertThat(queue.take(4).getDesc(), is("low"));
    }
}
