package ru.job4j.array;
import java.util.Arrays;

/** Удаление дубликатов из массива
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class ArrayDuplicate {
    private String line;

    /**
     * Удаляет из массива повторяющиеся строки
     * @param array исходный массив
     * @return массив без повторов
     */
    public String[] remove(String[] array) {
        int endArray = array.length;
        for (int i = 0; i < endArray; i++) {
            for (int j = i + 1; j < endArray; j++) {
                if (array[i].equals(array[j])) {

                    for (int z = j; z < endArray - 1; z++) {
                        array[z] = array[z + 1];
                    }
                    endArray--;
                }
            }
        }
        return Arrays.copyOf(array, endArray);
    }
}