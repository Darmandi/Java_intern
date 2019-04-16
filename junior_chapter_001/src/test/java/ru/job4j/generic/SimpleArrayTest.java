package ru.job4j.generic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Iterator;
import java.util.NoSuchElementException;
import static org.hamcrest.core.Is.is;


public class SimpleArrayTest {
    SimpleArray<Integer> arr = new SimpleArray<>(5);

    @Before
    public void fillArray() {
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
    }
    @Test
    public void whenAddElem() {
        Assert.assertThat(arr.get(3), is(4));
        Assert.assertNull(arr.get(4));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenException() {
        arr.get(5);
    }

    @Test
    public void whenRemoveElement() {
        arr.remove(0);
        Assert.assertThat(arr.get(0), is(2));
        Assert.assertThat(arr.get(1), is(3));
        Assert.assertThat(arr.get(2), is(4));
        Assert.assertNull(arr.get(3));
    }

    @Test
    public void whenSetElement() {
        arr.set(1, 5);
        Assert.assertThat(arr.get(1), is(5));
    }

    @Test
    public void testIterator() {
        Iterator<Integer> it = arr.iterator();
        Assert.assertThat(it.hasNext(), is(true));
        Assert.assertThat(it.hasNext(), is(true));
        Assert.assertThat(it.next(), is(1));
        Assert.assertThat(it.hasNext(), is(true));
        Assert.assertThat(it.next(), is(2));
        Assert.assertThat(it.hasNext(), is(true));
        Assert.assertThat(it.next(), is(3));
        Assert.assertThat(it.next(), is(4));
        Assert.assertThat(it.hasNext(), is(false));
    }

    @Test(expected = NoSuchElementException.class)
    public void whenIteratorException() {
        Iterator<Integer> it = arr.iterator();
        it.next();
        it.next();
        it.next();
        it.next();
        it.next();
    }
}