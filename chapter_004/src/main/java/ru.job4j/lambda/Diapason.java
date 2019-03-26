package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Класс для знакомства с функциональным интерфейсом
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class Diapason {

    /**
     * Метод добавляет в список результат выполнения функции для каждого целого числа в диапазоне
     * @param start начало диапазона
     * @param end конец диапазона
     * @param func функция
     * @return список с результатами
     */
    List<Double> diapason(double start, double end, Function<Double, Double> func) {
        List<Double> range = new ArrayList<>();
        for (double i = start; i < end; i++) {
            range.add(func.apply(i));
        }
        return range;
    }
}
