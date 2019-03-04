package ru.job4j.list;

import java.util.ArrayList;
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
        int indexrow = 0;
        int indexcell = 0;
        for (int elem : list) {
                array[indexrow][indexcell] = elem;
            if (indexcell < cells - 1) {
                indexcell++;
            } else {
                indexcell = 0;
                indexrow++;
            }
        }
        return array;
    }

    /**
     * Метод добавляет каждый элемент из массивов в списке в отдельный список
     * @param list список с массивами
     * @return список с элементами
     */
    public List<Integer> convert (List<int[]> list) {
        List<Integer> result = new ArrayList<>();
        for (int[] mass: list) {
            for (int elem: mass) {
                result.add(elem);
            }
        }
        return  result;
    }
}
