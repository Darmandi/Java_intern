package ru.job4j.generic;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Класс универсальная обертка над массивом.
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class SimpleArray<T> implements Iterable<T> {
    private Object[] array;
    private int count = 0;

    public SimpleArray(int size) {
        array = new Object[size];
    }

    /**
     * Добавляет элемент в массмв
     * @param elem элемент
     */
    public void add(T elem) {
        if (count == array.length) {
            throw new IndexOutOfBoundsException();
        }
        array[count++] = elem;
    }

    /**
     * Возвращает элемент по индексу
     * @param index индексу
     * @return элемент
     */
    public T get(int index) {
        return (T) array[index];
    }

    /**
     * Заменяет указанным элементом элемент, находящийся по индексу;
     * @param index индекс
     * @param elem указанный элемент
     */
    public void set(int index, T elem) {
        if (index >= count && index < 0) {
            throw new IndexOutOfBoundsException();
        }
        array[index] = elem;
    }

    /**
     * Удаляет элемент по указанному индексу
     * @param index индексу
     */
    public void remove(int index) {
        if (index >= count && index < 0) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
        count--;
    }

    /**
     * Итератор класса
     * @return итератор
     */
    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < count;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return (T) array[index++];
            }
        };
    }
}
