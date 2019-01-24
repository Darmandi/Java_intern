package ru.job4j.chess;

/**
 * @author Dmitrii Saraev
 * @version 1
 */

public class OccupiedWayException extends RuntimeException {
    public OccupiedWayException(String msg) {
        super(msg);
    }
}
