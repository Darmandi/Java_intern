package ru.job4j.chess;

/**
 * @author Dmitrii Saraev
 * @version 1
 */

public class FigureNotFoundException extends RuntimeException {
    public FigureNotFoundException(String msg) {
        super(msg);
    }
}