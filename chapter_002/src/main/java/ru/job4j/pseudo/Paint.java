package ru.job4j.pseudo;

/**
 * Класс вывода на печать
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class Paint {

    /**
     * Печатает фигуру
     * @param shape фигура
     */
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }
}
