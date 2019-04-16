package ru.job4j.list;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class SimpleArrayListTest {
    private SimpleArrayList<Integer> list;

    @Before
    public void beforeTest() {
        list = new SimpleArrayList<>();
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
    public void whenAddThreeElementsThenUseGetSizeResultThree() {
        Assert.assertThat(list.getSize(), is(3));
    }

    @Test
    public void checkDeleteMethod() {
        Assert.assertThat(list.delete(), is(1));
        Assert.assertThat(list.get(0), is(2));
        Assert.assertThat(list.get(1), is(3));
    }

    @Test(expected = NullPointerException.class)
    public void whenDeleteAllThenEmpty() {
        list.delete();
        list.delete();
        list.delete();
        Assert.assertNull(list.get(0));

    }
}
