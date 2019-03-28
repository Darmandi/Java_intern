package ru.job4j.tomap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Класс ConvertToMap
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class ConvertToMap {

    /**
     * Создает карту студентов
     * @param students студенты
     * @return карта
     */
    Map<String, Student> convert(List<Student> students) {
        return students.stream().distinct().collect(Collectors.toMap(Student::getName, i -> i));
    }
}
