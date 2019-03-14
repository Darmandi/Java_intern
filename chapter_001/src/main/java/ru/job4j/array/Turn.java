package ru.job4j.array;

/** Цикл на половину массива
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
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
