package ru.job4j.chess;

/**
 * @author Dmitrii Saraev
 * @version 1
 */

public class ImpossibleMoveException extends RuntimeException {
    public ImpossibleMoveException(String msg) {
        super(msg);
    }
}