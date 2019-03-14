package ru.job4j.loop;

/**
 * Цикл for
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class Factorial {

    /**
     * Вычисляет факториал числа
     * @param number заданное число
     * @return факториал
     */
    public int factorial(int number) {
        int temp = 1;
        for (int i = 1; i <= number; i++) {
            temp = temp * i;
        }
        return temp;
    }
}