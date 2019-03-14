package ru.job4j.array;

/** Сортировка пузырьком
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
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
