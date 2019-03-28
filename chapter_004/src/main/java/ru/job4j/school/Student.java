package ru.job4j.school;

/**
 * Класс студент для класса школы
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class Student {
    int score;

    /**
     * Студент
     * @param score средний балл
     */
    public Student(int score) {
        this.score = score;
    }

    public int getScore() {
        return  score;
    }
}
