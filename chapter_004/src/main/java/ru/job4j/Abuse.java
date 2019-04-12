package ru.job4j;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Тестовое задание 4 модуля
 */
public class Abuse {
    /**
     * Метод исключает стоп-слова из текста
     * @param words
     * @param filthy
     * @return
     */
    public List<String> clean(List<String> words, List<String> filthy) {
        List<String> words2 = new ArrayList<>();
        for (String w : words) {
            if (w.contains(" ")) {
                words2.add(w.substring(0, w.indexOf(" ")));

            } else {
                words2.add(w);
            }
        }
        List<String> ls3 = words2.stream().filter(o ->
            filthy.stream().allMatch(p -> !o.contains(p)))
                .collect(Collectors.toList());
        return ls3;
    }
}
