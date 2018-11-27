package ru.job4j.tracker;

/**
 * @author Dmitrii Saraev
 * @version 1
 */

public interface Input {
    String ask(String question);
    int ask(String question, int[] range);
}
