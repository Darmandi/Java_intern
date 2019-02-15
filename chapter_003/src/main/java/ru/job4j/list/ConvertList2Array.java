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
        int index = 0;
        int indexrow = 0;
        for (int[] row : array) {
            int indexcell = 0;
            for (int cell : row) {
                if (index >= list.size()) {
                    array[indexrow][indexcell] = 0;
                } else {
                    array[indexrow][indexcell] = list.get(index);
                    index++;
                }
                indexcell++;
            }
            indexrow++;
        }
        return array;
    }
}
