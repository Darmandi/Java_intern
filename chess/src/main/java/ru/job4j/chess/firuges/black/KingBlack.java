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
public class KingBlack implements Figure {
    private final Cell position;

    public KingBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        Cell[] steps = new Cell[0];
        if (Movement.kingDiagonal(source, dest)) {
            steps = new Cell[] {dest };
        } else if (Movement.kingStraight(source, dest)) {
            steps = new Cell[] {dest };
        } else {
            throw new ImpossibleMoveException("Невозможно сделать ход");
        }
        return steps;
    }

    @Override
    public Figure copy(Cell dest) {
        return new KingBlack(dest);
    }
}
