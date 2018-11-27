package ru.job4j.tracker;

/**
 * @author Dmitrii Saraev
 * @version 1
 */

public class StubInput implements Input {
    private String[] answers;
    private int position = 0;

    public StubInput(String[] answers) {
        this.answers = answers;
    }
    public String ask(String question) {
        return this.answers[position++];
    }
    public int ask(String question, int[] range) {
        throw new UnsupportedOperationException("Unsupported operation");
    }
}
