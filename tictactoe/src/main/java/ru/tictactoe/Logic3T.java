package ru.job4j.tictactoe;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    /**
     * Проверяет по предикату наличие фигуры в ячейках
     * @param predicate предикат
     * @param startX x координата начальной ячейки
     * @param startY y координата начальной ячейки
     * @param deltaX x координата следующей ячейки
     * @param deltaY y координата следующей ячейки
     * @return true or false
     */
    public boolean fillBy(Predicate<Figure3T> predicate, int startX, int startY, int deltaX, int deltaY) {
        boolean result = true;
        for (int index = 0; index != this.table.length; index++) {
            Figure3T cell = this.table[startY][startX];
            startX += deltaX;
            startY += deltaY;
            if (!predicate.test(cell)) {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Метод сверяет выигрышные комбинации для X
     * @return true or false
     */
    public boolean isWinnerX() {
        return this.fillBy(Figure3T::hasMarkX, 0, 0, 1, 0) ||
                this.fillBy(Figure3T::hasMarkX, 0, 0, 0, 1) ||
                this.fillBy(Figure3T::hasMarkX, 0,0, 1, 1) ||
                this.fillBy(Figure3T::hasMarkX, this.table.length - 1 , 0, -1, 1) ||
                this.fillBy(Figure3T::hasMarkX, this.table.length - 2, 0, 0, 1) ||
                this.fillBy(Figure3T::hasMarkX, this.table.length - 1, 0, 0, 1) ||
                this.fillBy(Figure3T::hasMarkX, 0, this.table.length - 2, 1, 0) ||
                this.fillBy(Figure3T::hasMarkX, 0, this.table.length - 1, 1, 0);
    }

    /**
     * Метод сверяет выигрышные комбинации для O
     * @return true or false
     */
    public boolean isWinnerO() {
        return this.fillBy(Figure3T::hasMarkO, 0, 0, 1, 0) ||
                this.fillBy(Figure3T::hasMarkO, 0, 0, 0, 1) ||
                this.fillBy(Figure3T::hasMarkO, 0,0, 1, 1) ||
                this.fillBy(Figure3T::hasMarkO, this.table.length - 1, 0, -1, 1) ||
                this.fillBy(Figure3T::hasMarkO, this.table.length - 2,0, 0, 1) ||
                this.fillBy(Figure3T::hasMarkO, this.table.length - 1, 0, 0, 1) ||
                this.fillBy(Figure3T::hasMarkO, 0, this.table.length - 2, 1, 0) ||
                this.fillBy(Figure3T::hasMarkO, 0, this.table.length - 1, 1, 0);
    }

    /**
     * Проверяет, остались ли свободные ячейки
     * @return true or false
     */
    public boolean hasGap() {
        return !Arrays.stream(table).flatMap(Arrays::stream).collect(Collectors.toList()).stream().allMatch(x -> x.hasMarkO() || x.hasMarkX());
    }
}
