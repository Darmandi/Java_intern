package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Класс для итерации по списку итераторов
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class IteratorOfIterators {

    /**
     * Метод создает итератор, проходящй по списку итераторов
     * @param it список итераторов
     * @return новый итератор
     */
    Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        return new Iterator<>() {
            Iterator<Integer> inner = it.next();

            @Override
            public boolean hasNext() {
                while (it.hasNext() && !inner.hasNext()) {
                        inner = it.next();
                }
                return inner.hasNext();
            }

            @Override
            public Integer next() {
                if (!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                return this.inner.next();
            }
        };
    }
}
