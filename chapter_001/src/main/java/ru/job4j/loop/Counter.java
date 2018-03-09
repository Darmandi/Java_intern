package ru.job4j.loop;

/**
 * @author Dmitrii Saraev
 * @version 1
 * @since 3.03.2018
 */

public class Counter {
    /**
     * Вычисляет сумму четных чисел в заданном диапазое
     * @param begin начало диапазона
     * @param end конец диапазона
     */
    public int sumOfEven(int begin, int end) {
        int temp = 0;
        for (int i = begin; i <= end; i++) {
            if (i % 2 == 0) {
                temp = temp + i;
            }
        }
        return temp;
    }
}
