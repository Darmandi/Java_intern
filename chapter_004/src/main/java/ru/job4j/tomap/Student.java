package ru.job4j.tomap;

/**
 * Класс студент для класса ConvertToMap
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class Student {
    private String name;

    /**
     * Студент
     * @param name имя
     */
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
