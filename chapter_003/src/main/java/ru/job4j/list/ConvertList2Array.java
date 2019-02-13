package ru.job4j.list;

import java.util.List;

public class ConvertList2Array {
    /**
     * Метод должен равномерно разбить лист на количество строк двумерного массива
     * @param list лист
     * @param rows количество строк
     * @return двумерный массив
     */
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = (int) Math.ceil((double) list.size() / rows);
        int[][] array = new int[rows][cells];
        for (int listIndex = 0; listIndex < list.size();) {
            for (int first = 0; first < rows; first++) {
                for (int second = 0; second < cells; second++) {
                    if (listIndex >= list.size()) {
                        array[first][second] = 0;
                    } else {
                        array[first][second] = list.get(listIndex);
                        listIndex++;
                    }
                }
            }
        }
        return array;
    }
}
