package ru.job4j;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Тестовое задание 4 модуля
 */
public class Abuse {
    /**
     * Метод исключает стоп-слова из текста
     * @param words текст
     * @param filthy список стоп-слов
     * @return исправленный текст
     */
    public List<String> clean(List<String> words, List<String> filthy) {
        List<String> words2 = words.stream()
                .map(w -> w.split(" "))
                .flatMap(Arrays::stream)
                .filter(w -> !w.contains(" "))
                .filter(o -> filthy.stream().allMatch(p -> !o.contains(p)))
                .collect(Collectors.toList());
        return words2;
    }
}
