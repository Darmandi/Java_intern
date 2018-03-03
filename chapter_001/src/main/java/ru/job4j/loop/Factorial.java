package ru.job4j.loop;

/**
 * @author Dmitrii Saraev
 * @version 1
 * @since 3.03.2018
 */

public class Factorial {
    /**
     * Вычисляет факториал числа
     * @param number заданное число
     * @return факториал
     */
    public int factorial (int number) {
        int temp = 1;
        for (int i = 1; i<=number; i++){
            if (number < 0)
                break;
            if (number == 0)
                return temp;
            temp = temp*i;
        }
        return temp;
    }
}
