package ru.job4j.list;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class SimpleStackTest {
    SimpleStack<Integer> stack;

    @Before
    public void fillStack() {
        stack = new SimpleStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
    }

    @Test
    public void whenPopThenPopped() {
        Assert.assertThat(stack.poll(), is(3));
        Assert.assertThat(stack.poll(), is(2));
        Assert.assertThat(stack.poll(), is(1));
    }
}
