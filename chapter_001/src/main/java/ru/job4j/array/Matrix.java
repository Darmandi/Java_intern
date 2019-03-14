package ru.job4j.array;

/** Двухуровневый цикл
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class Matrix {
    /**
     * Создает матрицу по типу таблицы умножения
     * @param size размер матрицы
     * @return матрица заданного размера
     */
    int[][] multiple(int size) {
        int[][] rsl = new int[size][size];
        for (int indexOne = 0; indexOne < size; indexOne++) {
            for (int indexTwo = 0; indexTwo < size; indexTwo++) {
                rsl[indexOne][indexTwo] = (indexOne + 1) * (indexTwo + 1);
            }
        }
        return rsl;
    }
}
