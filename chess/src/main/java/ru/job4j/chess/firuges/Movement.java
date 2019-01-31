package ru.job4j.chess.firuges;

/**
 * @author Dmitrii Saraev
 * @version 1
 */
public class Movement {

    public static Cell getCell(int x, int y) {
        Cell result = null;
        result = Cell.values()[x * 8 + y];
        return  result;
    }

    //Движение по диагонали
    public static boolean diagonal(Cell source, Cell dest) {
        boolean res = false;
        int deltaX = dest.x - source.x;
        int deltaY = dest.y - source.y;
        if (Math.abs(deltaX) == Math.abs(deltaY)) {
            res = true;
        }
        return res;
    }

    //Движение по вертикали и горизонтали
    public static boolean straight(Cell source, Cell dest) {
        boolean res = false;
        int deltaX = dest.x - source.x;
        int deltaY = dest.y - source.y;
        if (deltaX == 0 || deltaY == 0) {
            res = true;
        }
        return res;
    }

    //Движение черной пешки
    public static boolean pawnBlackMove(Cell source, Cell dest) {
        boolean res = false;
            if (source.y == dest.y + 1 && source.x == dest.x) {
                res = true;
            }
        return res;
    }

    //Движение белой пешки
    public static boolean pawnWhiteMove(Cell source, Cell dest) {
        boolean res = false;
        if (source.y == dest.y - 1 && source.x == dest.x) {
            res = true;
        }
        return res;
    }

    /**
     * Создаем массив клеток, через которые проходит фигура
     * @param source начальное положение фигуры
     * @param dest конечное положение
     * @return массив
     */
    public static Cell[] rout(Cell source, Cell dest) {
        Cell[] cells = new Cell[0];
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int j;
        for (int i:array) {

            //При движении прямо

            if (dest.y == source.y + i && source.x == dest.x) {
                j = i;
                cells = new Cell[j];
                for (int count = 0; count < j; count++) {
                    cells[count] = getCell(source.x, source.y + 1 + count);
                }
            }
            if (dest.y == source.y - i && source.x == dest.x) {
                j = i;
                cells = new Cell[j];
                for (int count = 0; count < j; count++) {
                    cells[count] = getCell(source.x, source.y - 1 - count);
                }
            }
            if (dest.y == source.y && dest.x == source.x + i) {
                j = i;
                cells = new Cell[j];
                for (int count = 0; count < j; count++) {
                    cells[count] = getCell(source.x + 1 + count, source.y);
                }
            }
            if (dest.y == source.y && dest.x == source.x - i) {
                j = i;
                cells = new Cell[j];
                for (int count = 0; count < j; count++) {
                    cells[count] = getCell(source.x - 1 - count, source.y);
                }
            }

            //При движении по диагонали

            if (dest.y == source.y + i && dest.x == source.x + i) {
                j = i;
                cells = new Cell[j];
                for (int count = 0; count < j; count++) {
                    cells[count] = getCell(source.x + 1 + count, source.y + 1 + count);
                }
            }
            if (dest.y == source.y + i && dest.x == source.x - i) {
                j = i;
                cells = new Cell[j];
                for (int count = 0; count < j; count++) {
                    cells[count] = getCell(source.x - 1 - count, source.y + 1 + count);
                }
            }
            if (dest.y == source.y - i && dest.x == source.x + i) {
                j = i;
                cells = new Cell[j];
                for (int count = 0; count < j; count++) {
                    cells[count] = getCell(source.x + 1 + count, source.y - 1 - count);
                }
            }
            if (dest.y == source.y - i && dest.x == source.x - i) {
                j = i;
                cells = new Cell[j];
                for (int count = 0; count < j; count++) {
                    cells[count] = getCell(source.x - 1 - count, source.y - 1 - count);
                }
            }
        }
        return cells;
    }

    //Движение короля по диагонали
    public static boolean kingDiagonal(Cell source, Cell dest) {
        boolean res = false;
            if (source.y == dest.y + 1 && source.x == dest.x + 1) {
                res = true;
            }
            if (source.y == dest.y + 1 && source.x == dest.x - 1) {
                res = true;
            }
            if (source.y == dest.y - 1 && source.x == dest.x + 1) {
                res = true;
            }
            if (source.y == dest.y - 1 && source.x == dest.x - 1) {
                res = true;
            }
        return res;
    }

    //Движение короля по горизонтали и вертикали
    public static boolean kingStraight(Cell source, Cell dest) {
        boolean res = false;
        if (source.y == dest.y + 1 && source.x == dest.x) {
            res = true;
        }
        if (source.y == dest.y - 1 && source.x == dest.x) {
            res = true;
        }
        if (source.y == dest.y && source.x == dest.x + 1) {
            res = true;
        }
        if (source.y == dest.y && source.x == dest.x - 1) {
            res = true;
        }
        return res;
    }

    //Движение коня
    public static boolean knight(Cell source, Cell dest) {
        boolean res = false;

        if (dest.y == source.y + 2 && dest.x == source.x + 1) {
            res = true;
        }
        if (dest.y == source.y + 2 && dest.x == source.x - 1) {
            res = true;
        }

        if (dest.y == source.y - 2 && dest.x == source.x + 1) {
            res = true;
        }
        if (dest.y == source.y - 2 && dest.x == source.x - 1) {
            res = true;
        }

        if (dest.y == source.y + 1 && dest.x == source.x - 2) {
            res = true;
        }
        if (dest.y == source.y - 1 && dest.x == source.x - 2) {
            res = true;
        }

        if (dest.y == source.y + 1 && dest.x == source.x + 2) {
            res = true;
        }
        if (dest.y == source.y - 1 && dest.x == source.x + 2) {
            res = true;
        }
        return res;
    }
}
