package ru.job4j.list;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DynamicList<E> implements Iterable<E> {
    private static final int DEFSIZE = 10;
    private Object[] container;
    private int position;
    private int modCount;

    public DynamicList() {
        container = new Object[DEFSIZE];
    }

    public DynamicList(int size) {
        container = new Object[size];
    }

    /**
     * Увеличивает размер массива, если массив полностью заполнен
     */
    private void incSize() {
        if (position >= container.length) {
            container = Arrays.copyOf(container, container.length + DEFSIZE);
        }
    }

    public int getSize() {
        return this.container.length;
    }

    /**
     * Добавляет новый элемент
     * @param value элемент
     */
    public void add(E value) {
        incSize();
        container[position++] = value;
        modCount++;
    }

    /**
     * Возвращает элемент по индексу
     * @param index индексу
     * @return элемент
     */
    public E get(int index) {
        E result = null;
        if (index <= position) {
            result = (E) container[index];
        }
        return result;
    }

    /**
     * Итератор класса
     * @return итератор
     */
    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            int index = 0;
            int expectedModCount = modCount;

            @Override
            public boolean hasNext() {
                return index < position;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                if (modCount != expectedModCount) {
                    throw new ConcurrentModificationException();
                }
                return (E) container[index++];
            }
        };
    }
}
