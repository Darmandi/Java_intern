package ru.job4j.pseudo;

/**
 * Класс треугольника
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class Triangle implements Shape {

    /**
     * Печатает треугольник
     * @return
     */
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("   +   ");
        pic.append(System.lineSeparator());
        pic.append(" +   + ");
        pic.append(System.lineSeparator());
        pic.append("+++++++");
        return pic.toString();
    }
}
