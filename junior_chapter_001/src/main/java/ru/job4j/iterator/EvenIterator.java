package ru.job4j.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenIterator implements Iterator {
    private final int[] value;
    int index = 0;

    public EvenIterator(final int[] value) {
        this.value = Arrays.stream(value).filter(x -> x % 2 == 0).toArray();
    }

    @Override
    public boolean hasNext() {
        return value.length > index;
    }

    @Override
    public Object next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        return value[index++];
    }
}
