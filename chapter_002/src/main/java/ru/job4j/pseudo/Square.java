package ru.job4j.pseudo;

/**
 * Класс квадрата
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class Square implements Shape {

    /**
     * Печатает квадрат
     * @return
     */
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
