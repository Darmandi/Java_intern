package ru.job4j.list;

import org.junit.Test;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;


public class DynamicListTest {
    @Test
    public void checkDefaultConstructor() {
        DynamicList<Integer> container = new DynamicList<>();
        assertThat(container.getSize(), is(10));
    }

    @Test
    public void checkParameterConstructor() {
        DynamicList<Integer> container = new DynamicList<>(5);
        assertThat(container.getSize(), is(5));
    }

    @Test
    public void whenAddTwoElements() {
        DynamicList<String> container = new DynamicList<>(2);
        container.add("1");
        container.add("2");
        assertThat(container.get(0), is("1"));
        assertThat(container.get(1), is("2"));
    }

    @Test
    public void checkAutoIncSize() {
        DynamicList<String> container = new DynamicList<>(2);
        container.add("1");
        container.add("2");
        assertThat(container.getSize(), is(2));
        container.add("3");
        assertThat(container.getSize(), is(12));
    }

    @Test
    public void whenGetInvalidIndex() {
        DynamicList<Integer> container = new DynamicList<>(1);
        assertNull(container.get(2));
    }

    @Test
    public void checkIterator() {
        DynamicList<Integer> container = new DynamicList<>(2);
        container.add(1);
        container.add(2);
        Iterator<Integer> it = container.iterator();
        assertThat(it.hasNext(), is(true));
        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is(1));
        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is(2));
        assertThat(it.hasNext(), is(false));
    }

    @Test(expected = NoSuchElementException.class)
    public void whenIteratorOutOfArray() {
        DynamicList<Integer> container = new DynamicList<>(1);
        Iterator<Integer> it = container.iterator();
        it.next();
        it.next();
    }

    @Test(expected = ConcurrentModificationException.class)
    public void checkIteratorException() {
        DynamicList<Integer> container = new DynamicList<>(1);
        Iterator<Integer> it = container.iterator();
        container.add(1);
        it.next();
    }
}
