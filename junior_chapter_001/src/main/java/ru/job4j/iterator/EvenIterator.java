package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Класс для итерации по четным значениям массива
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class EvenIterator implements Iterator {
    private final int[] value;
    private int index = 0;

    public EvenIterator(final int[] value) {
        this.value = value;
    }

    /**
     * Метод ищет индекс четного числа возврвщает true, если находит
     * @return true или false
     */
    @Override
    public boolean hasNext() {
        boolean result = false;
        for (int i = index; i < value.length; i++) {
            if (value[i] % 2 == 0) {
                index = i;
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод возврвщает следующее четное число
     * @return true или false
     */
    @Override
    public Object next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        return value[index++];
    }
}
