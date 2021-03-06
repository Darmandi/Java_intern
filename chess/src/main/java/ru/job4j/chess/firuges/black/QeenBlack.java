package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.Movement;

/**
 *
 * @author Dmitrii Saraev
 * @version 1
 */
public class QeenBlack implements Figure {
    private final Cell position;

    public QeenBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        Cell[] steps = new Cell[0];
        if (Movement.diagonal(source, dest)) {
            steps = Movement.rout(source, dest);
        } else if (Movement.straight(source, dest)) {
            steps = Movement.rout(source, dest);
        } else {
            throw new ImpossibleMoveException("Невозможно сделать ход");
        }
        return steps;
    }

    @Override
    public Figure copy(Cell dest) {
        return new QeenBlack(dest);
    }
}
