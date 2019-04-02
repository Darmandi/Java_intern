package ru.job4j.jdk11;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

/**
 * Класс студент с использованием Stream API JDK 11
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class Student implements Comparable<Student> {
    private String name;
    private int score;

    /**
     * Студент
     * @param name имя
     * @param score средний балл
     */
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return  score;
    }

    public String getName() {
        return  name;
    }

    @Override
    public int compareTo(Student student) {
        int result = Integer.compare(student.score, this.score);
        return (result != 0) ? result : this.name.compareTo(student.name);
    }

    /**
     * Метод избавляется от null элементов в списке стуентов, сортирует его по среднему баллу в порядке убывания,
     * и выводит список студентов со средним баллом более установленного значения
     * @param students список стуентов
     * @param bound установленное значение
     * @return новый список
     */
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream().flatMap(Stream::ofNullable).sorted().takeWhile(stud -> stud.getScore() > bound).collect(Collectors.toList());
    }

}
