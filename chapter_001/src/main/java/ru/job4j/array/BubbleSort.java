package ru.job4j.array;

/**
 * @author Dmtrii Saraev
 * @version 1
 * @since 7.03.2018
 */

public class BubbleSort {
    /**
     * Сортирует члены массива по возрастанию
     * @param array исходный массив
     * @return отсортированный массив
     */
    public int[] sort(int[] array) {
        for (int check = 0; check < array.length; check++) {
            for (int index = 0; index < array.length - 1; index++) {
                if (array[index] > array[index + 1]) {
                    int temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
            }
        }
        return array;
    }
}
