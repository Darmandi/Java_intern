package ru.job4j.list;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class DynamicLincedListTest {
    private DynamicLincedList<Integer> list;

    @Before
    public void beforeTest() {
        list = new DynamicLincedList<>();
        list.add(3);
        list.add(2);
        list.add(1);
    }

    @Test
    public void checkAddMethod() {
        Assert.assertThat(list.get(0), is(1));
        Assert.assertThat(list.get(1), is(2));
        Assert.assertThat(list.get(2), is(3));
    }

    @Test
    public void checkSizeMethod() {
        Assert.assertThat(list.getSize(), is(3));
    }

}
