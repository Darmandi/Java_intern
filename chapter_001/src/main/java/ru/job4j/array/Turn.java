package ru.job4j.array;

/**
 * @author Dmtrii Saraev
 * @version 1
 * @since 7.03.2018
 */

public class Turn {
    /**
     * Переворачивает массив
     * @param array заданный массив
     * @return перевернутый массив
     */
    public int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = temp;
        }
        return array;
    }
}
