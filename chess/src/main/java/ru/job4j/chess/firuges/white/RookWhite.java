package ru.job4j.chess.firuges.white;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.Movement;

/**
 *
 * @author Dmitrii Saraev
 * @version 1
 */
public class RookWhite implements Figure {
    private final Cell position;

    public RookWhite(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        Cell[] steps = new Cell[0];
        if (Movement.straight(source, dest)) {
            steps = Movement.rout(source, dest);
        } else {
            throw new ImpossibleMoveException("Невозможно сделать ход");
        }
        return steps;
    }

    @Override
    public Figure copy(Cell dest) {
        return new RookWhite(dest);
    }
}
