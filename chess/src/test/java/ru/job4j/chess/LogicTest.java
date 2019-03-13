package ru.job4j.chess;
import org.junit.Before;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.KingBlack;
import ru.job4j.chess.firuges.black.KnightBlack;
import ru.job4j.chess.firuges.black.PawnBlack;
import ru.job4j.chess.firuges.black.QeenBlack;
import ru.job4j.chess.firuges.black.RookBlack;
import ru.job4j.chess.firuges.white.PawnWhite;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LogicTest {
    Logic logic = new Logic();
    RookBlack figure1 = new RookBlack(Cell.A1);
    KnightBlack figure2 = new KnightBlack(Cell.A2);
    BishopBlack figure3 = new BishopBlack(Cell.A3);
    QeenBlack figure4 = new QeenBlack(Cell.A4);
    KingBlack figure5 = new KingBlack(Cell.A5);
    BishopBlack figure6 = new BishopBlack(Cell.A6);
    BishopBlack figure7 = new BishopBlack(Cell.A7);
    RookBlack figure8 = new RookBlack(Cell.A8);
    RookBlack figure9 = new RookBlack(Cell.B1);
    KnightBlack figure10 = new KnightBlack(Cell.B2);
    BishopBlack figure11 = new BishopBlack(Cell.B3);
    QeenBlack figure12 = new QeenBlack(Cell.B4);
    KingBlack figure13 = new KingBlack(Cell.B5);
    BishopBlack figure14 = new BishopBlack(Cell.B6);
    BishopBlack figure15 = new BishopBlack(Cell.B7);
    RookBlack figure16 = new RookBlack(Cell.B8);
    BishopBlack figure17 = new BishopBlack(Cell.G1);
    BishopBlack figure18 = new BishopBlack(Cell.G2);
    BishopBlack figure19 = new BishopBlack(Cell.G3);
    BishopBlack figure20 = new BishopBlack(Cell.G4);
    BishopBlack figure21 = new BishopBlack(Cell.G5);
    BishopBlack figure22 = new BishopBlack(Cell.G6);
    BishopBlack figure23 = new BishopBlack(Cell.G7);
    BishopBlack figure24 = new BishopBlack(Cell.G8);
    BishopBlack figure25 = new BishopBlack(Cell.H1);
    BishopBlack figure26 = new BishopBlack(Cell.H2);
    BishopBlack figure27 = new BishopBlack(Cell.H3);
    BishopBlack figure28 = new BishopBlack(Cell.H4);
    BishopBlack figure29 = new BishopBlack(Cell.H5);
    BishopBlack figure30 = new BishopBlack(Cell.H6);
    BishopBlack figure31 = new BishopBlack(Cell.H7);
    BishopBlack figure32 = new BishopBlack(Cell.H8);

    @Before
    public void addFigures() {
        logic.add(figure1);
        logic.add(figure2);
        logic.add(figure3);
        logic.add(figure4);
        logic.add(figure5);
        logic.add(figure6);
        logic.add(figure7);
        logic.add(figure8);
        logic.add(figure9);
        logic.add(figure10);
        logic.add(figure11);
        logic.add(figure12);
        logic.add(figure13);
        logic.add(figure14);
        logic.add(figure15);
        logic.add(figure16);
        logic.add(figure17);
        logic.add(figure18);
        logic.add(figure19);
        logic.add(figure20);
        logic.add(figure21);
        logic.add(figure22);
        logic.add(figure23);
        logic.add(figure24);
        logic.add(figure25);
        logic.add(figure26);
        logic.add(figure27);
        logic.add(figure28);
        logic.add(figure29);
        logic.add(figure30);
        logic.add(figure31);
        logic.add(figure32);
    }
    @Test(expected = OccupiedWayException.class)
    public void rookA1A2() {
        assertThat(logic.move(Cell.A1, Cell.A2), is(false));
    }

    @Test(expected = OccupiedWayException.class)
    public void rookA1B1() {
        assertThat(logic.move(Cell.A1, Cell.B1), is(false));
    }

    @Test(expected = OccupiedWayException.class)
    public void rookA1C1() {
        assertThat(logic.move(Cell.A1, Cell.C1), is(false));
    }

    @Test
    public void rookB1() {
        assertThat(logic.move(Cell.B1, Cell.F1), is(true));
        assertThat(logic.move(Cell.F1, Cell.F4), is(true));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void rookA2C2() {
        assertThat(logic.move(Cell.A2, Cell.C2), is(false));
    }

    @Test
    public void knightA2() {
        assertThat(logic.move(Cell.A2, Cell.C3), is(true));
        assertThat(logic.move(Cell.C3, Cell.D5), is(true));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void rookB2C2() {
        assertThat(logic.move(Cell.B2, Cell.C2), is(false));
    }

    @Test
    public void knightB2() {
        assertThat(logic.move(Cell.B2, Cell.C4), is(true));
        assertThat(logic.move(Cell.C4, Cell.E3), is(true));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void bishopA3() throws ImpossibleMoveException {
        assertThat(logic.move(Cell.A3, Cell.B3), is(false));
    }

    @Test
    public void bishopB3() {
        assertThat(logic.move(Cell.B3, Cell.D1), is(true));
        assertThat(logic.move(Cell.D1, Cell.F3), is(true));
    }

    @Test
    public void qeenB4() {
        assertThat(logic.move(Cell.B4, Cell.E4), is(true));
        assertThat(logic.move(Cell.E4, Cell.E8), is(true));
        assertThat(logic.move(Cell.E8, Cell.C6), is(true));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void rookB5D5() {
        assertThat(logic.move(Cell.B5, Cell.D5), is(false));
    }

    @Test
    public void kingB5() {
        assertThat(logic.move(Cell.B5, Cell.C4), is(true));
        assertThat(logic.move(Cell.C4, Cell.C5), is(true));
        assertThat(logic.move(Cell.C5, Cell.D5), is(true));
    }

    @Test(expected = FigureNotFoundException.class)
    public void moveC1() {
        assertThat(logic.move(Cell.C1, Cell.C4), is(true));
    }
}