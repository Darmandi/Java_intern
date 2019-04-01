package ru.job4j.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Преобразование элемента потока в новый поток.
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class Convert {
    /**
     * Преобоазует двумерный массив в список
     * @param array массив
     * @return список
     */
    public List<Integer> toList(Integer[][] array) {
        return Stream.of(array).flatMap(Arrays::stream).collect(Collectors.toList());
    }
}
