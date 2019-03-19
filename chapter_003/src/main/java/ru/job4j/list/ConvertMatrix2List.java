package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Конвертация массива в list
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class ConvertMatrix2List {

    /**
     * Конвертация двумерного массива в ArrayList
     * @param array входной массив
     * @return ArrayList
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row: array) {
            for (int cell: row) {
                list.add(cell);
            }
        }
        return list;
    }
}
