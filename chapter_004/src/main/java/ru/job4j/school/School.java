package ru.job4j.school;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Класс школа
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class School {
    /**
     * Формирует новый список по предикату из списка студентов
     * @param students список студентов
     * @param predict предикат
     * @return новый список
     */
    List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }
}
