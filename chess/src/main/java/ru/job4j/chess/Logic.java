package ru.job4j.chess;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.Movement;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Logic {
    private final Figure[] figures = new Figure[32];
    private int index = 0;

    public void add(Figure figure) {
        this.figures[this.index++] = figure;
    }

    public boolean move(Cell source, Cell dest) {
        boolean rst = false;
        int index = this.findBy(source);
        if (index != -1) {
            Cell[] steps = this.figures[index].way(source, dest);
            int j = 0;
            if (steps.length > 0 && steps[steps.length - 1].equals(dest)) {

                //Проверка, что фигура не переходит на уже занятое поле
                // и не перепрыгивает через фигуру
                if (Movement.straight(source, dest) || Movement.diagonal(source, dest)) {
                    for (Cell y : Movement.rout(source, dest)) {
                        for (Figure i : figures) {
                            if (y != i.position())
                                j++;
                        }
                    }
                    if (j == 32 || j == 64 || j == 96 || j == 128 || j == 160 || j == 192 || j == 224) {
                        rst = true;
                        this.figures[index] = this.figures[index].copy(dest);
                    }
                }
                if (Movement.knight(source, dest)  || Movement.pawnWhiteMove(source, dest) || Movement.pawnBlackMove(source, dest)) {
                    for (Figure i : figures) {
                        if (dest != i.position())
                            j++;
                    }
                    if (j == 32) {
                        rst = true;
                        this.figures[index] = this.figures[index].copy(dest);
                    }
                }
            }
        }
        return rst;
    }

    public void clean() {
        for (int position = 0; position != this.figures.length; position++) {
            this.figures[position] = null;
        }
        this.index = 0;
    }

    private int findBy(Cell cell) {
        int rst = -1;
        for (int index = 0; index != this.figures.length; index++) {
            if (this.figures[index] != null && this.figures[index].position().equals(cell)) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
