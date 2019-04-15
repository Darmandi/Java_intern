package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Класс для итерации по двумерному массиву
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class JaggedArrayIterator implements Iterator {
    private final int[][] value;
    private int row = 0;
    private int cell = 0;

    /**
     * Класс с массивом
     * @param value массив
     */
    public JaggedArrayIterator(final int[][] value) {
        this.value = value;
    }

    /**
     * Метод проверяет, выходит ли каретка за пределы массива
     * @return false если выходит
     */
    @Override
    public boolean hasNext() {
        boolean res = true;
        if (value.length == row) {
            res = false;
        }
        return res;
    }

    /**
     * Метод возвращает ячейку двумерного массива и сдвигает каретку на следующую ячейку
     * @return ячейка массива
     */
    @Override
    public Object next() {
        int res;
        if (value[row].length == cell + 1) {
            res = value[row][cell];
            cell = 0;
            row++;
        } else {
            res = value[row][cell];
            cell++;
        }
        return res;
    }
}
