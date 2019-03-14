package ru.job4j.profession;

/**
 * Класс студент для класса Teacher
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class Student {
    public String name;
    public String study;

    /**
     * Студент
     * @param name имя студента
     * @param study обучаемость
     */
    public Student(String name, String study) {
        this.name = name;
        this.study = study;
    }
}
