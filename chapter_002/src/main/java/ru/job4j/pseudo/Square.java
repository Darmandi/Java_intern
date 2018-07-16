package ru.job4j.pseudo;

/**
 * @author Dmitrii Saraev
 * @version 1
 */

public class Square implements Shape {
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("++++++++");
        pic.append(System.lineSeparator());
        pic.append("+      +");
        pic.append(System.lineSeparator());
        pic.append("+      +");
        pic.append(System.lineSeparator());
        pic.append("++++++++");
        return pic.toString();
    }
}
