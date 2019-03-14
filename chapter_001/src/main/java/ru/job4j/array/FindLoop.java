package ru.job4j.array;

/** Цикл for
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class FindLoop {

    /**
     * Метод выводит индекс элемента массива
     * @param data массив
     * @param elem элемент
     * @return индекс
     */
    public int indexOf(int[] data, int elem) {
        int rsl = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == elem) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
}
