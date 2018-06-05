package ru.job4j.profession;
/**
 * @author Dmitrii Saraev
 * @version 1
 * @since 05.06.2018
 */
public class Student {
    public String name;
    public String study;

    /**
     * Класс студент для класса Teacher
     * @param name имя студента
     * @param study обучаемость
     */

    public Student(String name, String study) {
        this.name = name;
        this.study = study;
    }
}
